(ns clojure-breakout.core
  (:require [quil.core :as q]
            [quil.middleware :as qm])
  (:import [java.awt.event KeyEvent])
  (:gen-class :main true))

(load "levels")

; globals
(def ball-speed 8)
(def racket-speed 15)
(def racket-width 150)
(def screen-width 1000)

(defn draw-rect [r]
  (q/rect (:x r) (:y r) (:w r) (:h r)))

(defn move-ball [{:keys [racket ball score bricks ball-dir] :as state}]
  (if (= ball-dir [0 0])
    (assoc-in state [:ball :x] (+ 20 (racket :x)))
    (update-in state [:ball] assoc 
               :x (+ (ball :x) (* ball-speed (first ball-dir)))
               :y (+ (ball :y) (* ball-speed (second ball-dir))))))

(defn game-over? [{:keys [racket ball score bricks ball-dir lives status-msg] :as state}] 
  (cond (> (ball :y) (+ (racket :h) (racket :y))) 
        (if (<= lives 0) 
          (assoc state :status-msg "GAME OVER") 
          (-> state 
              (update-in [:lives] dec) 
              (assoc :ball {:x (+ 20 (racket :x)) :y 640 :w 10 :h 10} :ball-dir [0 0])))
        (empty? bricks) 
        (-> state 
            (assoc-in [:ball :h] 0)
            (assoc :status-msg "YOU WIN!" :ball-dir [0 0]))
        :neither state))

(defn reflect [{:keys [racket ball score bricks ball-dir] :as state}]
  (let [[dir-x dir-y] ball-dir
        ball-x (if (> dir-x 0) (+ (ball :w) (ball :x)) (ball :x))
        ball-y (if (> dir-y 0) (+ (ball :h) (ball :y)) (ball :y))
        in-brick? (fn [{x :x y :y w :w h :h}]
                    (when (and (<= y ball-y (+ h y)) (<= x ball-x (+ w x))) [x y w h]))
        reflect-racket [(* 2.5 (- (/ (- (ball :x) (racket :x)) (racket :w)) 0.5)) (- dir-y)]
        change-dir (fn [state new-dir] (assoc-in state [:ball-dir] new-dir))
        update-score (fn [state] (update-in state [:score :val] inc))
        remove-brick (fn [state dead-brick] (assoc state :bricks (filter #(not= % dead-brick) bricks)))]

    (if-let [[x y w h] (some in-brick? bricks)]
      (let [direction (if (< (min (- ball-y y) (- (+ y h) ball-y))
                             (min (- ball-x x) (- (+ x w) ball-x)))
                        [dir-x (- dir-y)] [(- dir-x) dir-y])]
        (-> state
            (change-dir direction)
            (remove-brick {:x x :y y :h h :w w})
            update-score))

      (cond (not (<= 0 ball-x screen-width)) (change-dir state [(- dir-x) dir-y])
            (<= ball-y 0) (change-dir state [dir-x (- dir-y)])
            (in-brick? racket) (change-dir state reflect-racket)
            :do-nothing state))))

(defn setup []
  ; initial state
  (q/smooth)
  (q/no-stroke)
  (q/frame-rate 100)
  (q/background 200)
  (q/fill 0xff)
  (q/background-float 0x20)
  (q/text-size 20)

  {:racket {:x 350 :y 650 :w racket-width :h 5}
   :ball {:x 375 :y 640 :w 10 :h 10}
   :score {:val 0 :pos [15 685]}
   :bricks level-1
   :ball-dir [0 0]
   :lives 3
   :status-msg "(click to start)"})

(defn mouse-moved [state event]
  (if (< (/ racket-width 2) (event :x) (- screen-width (/ racket-width 2)))
    (assoc-in state [:racket :x] (- (event :x) (/ racket-width 2)))
    state))

(defn mouse-clicked [state event]
  (if (= (state :ball-dir) [0 0])
    (assoc state :ball-dir [-0.5 -0.5] :status-msg "")))

(defn draw [{racket :racket ball :ball
             {score :val [score-x score-y] :pos} :score
             bricks :bricks
             [ball-x ball-y] :ball-dir
             lives :lives
             status-msg :status-msg}]
  ; setup
  (q/color-mode :hsb) 
  (q/background-float 0 0 20) ; background
  (q/fill 360 0 360) ; draw white
  (draw-rect racket) 
  (draw-rect ball)
  (q/text status-msg 425 500) ; win/lose msg
  (doseq [brick bricks] (draw-rect brick)) ; bricks
  
  (q/fill 150 200 300) ; draw blue
  (q/text-num score score-x score-y) ; score
  (doseq [i (range lives)]
    (draw-rect {:x (+ (* 50 i) 840) :y 675 :w 15 :h 5}))) ; lives

(defn -main [& args]
  (q/defsketch breakout
    :title "broken boxes"
    :setup setup
    :draw draw
    :mouse-moved mouse-moved
    :mouse-clicked mouse-clicked
    :update #(-> % move-ball reflect game-over?)
    :middleware [qm/fun-mode]
    :size [screen-width 700]))
