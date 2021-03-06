(in-ns 'broken-boxes.core)

(def level-1 [{:x 20 :y 35 :w 50 :h 10}
              {:x 20 :y 50 :w 50 :h 10}
              {:x 20 :y 65 :w 50 :h 10}
              {:x 20 :y 80 :w 50 :h 10}
              {:x 20 :y 95 :w 50 :h 10}
              {:x 20 :y 110 :w 50 :h 10}
              {:x 20 :y 125 :w 50 :h 10}
              {:x 20 :y 140 :w 50 :h 10}
              {:x 20 :y 155 :w 50 :h 10}
              {:x 20 :y 170 :w 50 :h 10}
              {:x 20 :y 185 :w 50 :h 10}
              {:x 20 :y 200 :w 50 :h 10}
              {:x 20 :y 215 :w 50 :h 10}
              {:x 20 :y 230 :w 50 :h 10}
              {:x 20 :y 245 :w 50 :h 10}
              {:x 20 :y 260 :w 50 :h 10}
              {:x 20 :y 275 :w 50 :h 10}
              {:x 20 :y 290 :w 50 :h 10}
              {:x 20 :y 305 :w 50 :h 10}
              {:x 20 :y 320 :w 50 :h 10}
              {:x 80 :y 35 :w 50 :h 10}
              {:x 80 :y 50 :w 50 :h 10}
              {:x 80 :y 65 :w 50 :h 10}
              {:x 80 :y 80 :w 50 :h 10}
              {:x 80 :y 95 :w 50 :h 10}
              {:x 80 :y 110 :w 50 :h 10}
              {:x 80 :y 125 :w 50 :h 10}
              {:x 80 :y 140 :w 50 :h 10}
              {:x 80 :y 155 :w 50 :h 10}
              {:x 80 :y 170 :w 50 :h 10}
              {:x 80 :y 185 :w 50 :h 10}
              {:x 80 :y 200 :w 50 :h 10}
              {:x 80 :y 215 :w 50 :h 10}
              {:x 80 :y 230 :w 50 :h 10}
              {:x 80 :y 245 :w 50 :h 10}
              {:x 80 :y 260 :w 50 :h 10}
              {:x 80 :y 275 :w 50 :h 10}
              {:x 80 :y 290 :w 50 :h 10}
              {:x 80 :y 305 :w 50 :h 10}
              {:x 80 :y 320 :w 50 :h 10}
              {:x 140 :y 35 :w 50 :h 10}
              {:x 140 :y 50 :w 50 :h 10}
              {:x 140 :y 65 :w 50 :h 10}
              {:x 140 :y 80 :w 50 :h 10}
              {:x 140 :y 95 :w 50 :h 10}
              {:x 140 :y 110 :w 50 :h 10}
              {:x 140 :y 125 :w 50 :h 10}
              {:x 140 :y 140 :w 50 :h 10}
              {:x 140 :y 155 :w 50 :h 10}
              {:x 140 :y 170 :w 50 :h 10}
              {:x 140 :y 185 :w 50 :h 10}
              {:x 140 :y 200 :w 50 :h 10}
              {:x 140 :y 215 :w 50 :h 10}
              {:x 140 :y 230 :w 50 :h 10}
              {:x 140 :y 245 :w 50 :h 10}
              {:x 140 :y 260 :w 50 :h 10}
              {:x 140 :y 275 :w 50 :h 10}
              {:x 140 :y 290 :w 50 :h 10}
              {:x 140 :y 305 :w 50 :h 10}
              {:x 140 :y 320 :w 50 :h 10}
              {:x 200 :y 35 :w 50 :h 10}
              {:x 200 :y 50 :w 50 :h 10}
              {:x 200 :y 65 :w 50 :h 10}
              {:x 200 :y 80 :w 50 :h 10}
              {:x 200 :y 95 :w 50 :h 10}
              {:x 200 :y 110 :w 50 :h 10}
              {:x 200 :y 125 :w 50 :h 10}
              {:x 200 :y 140 :w 50 :h 10}
              {:x 200 :y 155 :w 50 :h 10}
              {:x 200 :y 170 :w 50 :h 10}
              {:x 200 :y 185 :w 50 :h 10}
              {:x 200 :y 200 :w 50 :h 10}
              {:x 200 :y 215 :w 50 :h 10}
              {:x 200 :y 230 :w 50 :h 10}
              {:x 200 :y 245 :w 50 :h 10}
              {:x 200 :y 260 :w 50 :h 10}
              {:x 200 :y 275 :w 50 :h 10}
              {:x 200 :y 290 :w 50 :h 10}
              {:x 200 :y 305 :w 50 :h 10}
              {:x 200 :y 320 :w 50 :h 10}
              {:x 260 :y 35 :w 50 :h 10}
              {:x 260 :y 50 :w 50 :h 10}
              {:x 260 :y 65 :w 50 :h 10}
              {:x 260 :y 80 :w 50 :h 10}
              {:x 260 :y 95 :w 50 :h 10}
              {:x 260 :y 110 :w 50 :h 10}
              {:x 260 :y 125 :w 50 :h 10}
              {:x 260 :y 140 :w 50 :h 10}
              {:x 260 :y 155 :w 50 :h 10}
              {:x 260 :y 170 :w 50 :h 10}
              {:x 260 :y 185 :w 50 :h 10}
              {:x 260 :y 200 :w 50 :h 10}
              {:x 260 :y 215 :w 50 :h 10}
              {:x 260 :y 230 :w 50 :h 10}
              {:x 260 :y 245 :w 50 :h 10}
              {:x 260 :y 260 :w 50 :h 10}
              {:x 260 :y 275 :w 50 :h 10}
              {:x 260 :y 290 :w 50 :h 10}
              {:x 260 :y 305 :w 50 :h 10}
              {:x 260 :y 320 :w 50 :h 10}
              {:x 320 :y 35 :w 50 :h 10}
              {:x 320 :y 50 :w 50 :h 10}
              {:x 320 :y 65 :w 50 :h 10}
              {:x 320 :y 80 :w 50 :h 10}
              {:x 320 :y 95 :w 50 :h 10}
              {:x 320 :y 110 :w 50 :h 10}
              {:x 320 :y 125 :w 50 :h 10}
              {:x 320 :y 140 :w 50 :h 10}
              {:x 320 :y 155 :w 50 :h 10}
              {:x 320 :y 170 :w 50 :h 10}
              {:x 320 :y 185 :w 50 :h 10}
              {:x 320 :y 200 :w 50 :h 10}
              {:x 320 :y 215 :w 50 :h 10}
              {:x 320 :y 230 :w 50 :h 10}
              {:x 320 :y 245 :w 50 :h 10}
              {:x 320 :y 260 :w 50 :h 10}
              {:x 320 :y 275 :w 50 :h 10}
              {:x 320 :y 290 :w 50 :h 10}
              {:x 320 :y 305 :w 50 :h 10}
              {:x 320 :y 320 :w 50 :h 10}
              {:x 380 :y 35 :w 50 :h 10}
              {:x 380 :y 50 :w 50 :h 10}
              {:x 380 :y 65 :w 50 :h 10}
              {:x 380 :y 80 :w 50 :h 10}
              {:x 380 :y 95 :w 50 :h 10}
              {:x 380 :y 110 :w 50 :h 10}
              {:x 380 :y 125 :w 50 :h 10}
              {:x 380 :y 140 :w 50 :h 10}
              {:x 380 :y 155 :w 50 :h 10}
              {:x 380 :y 170 :w 50 :h 10}
              {:x 380 :y 185 :w 50 :h 10}
              {:x 380 :y 200 :w 50 :h 10}
              {:x 380 :y 215 :w 50 :h 10}
              {:x 380 :y 230 :w 50 :h 10}
              {:x 380 :y 245 :w 50 :h 10}
              {:x 380 :y 260 :w 50 :h 10}
              {:x 380 :y 275 :w 50 :h 10}
              {:x 380 :y 290 :w 50 :h 10}
              {:x 380 :y 305 :w 50 :h 10}
              {:x 380 :y 320 :w 50 :h 10}
              {:x 440 :y 35 :w 50 :h 10}
              {:x 440 :y 50 :w 50 :h 10}
              {:x 440 :y 65 :w 50 :h 10}
              {:x 440 :y 80 :w 50 :h 10}
              {:x 440 :y 95 :w 50 :h 10}
              {:x 440 :y 110 :w 50 :h 10}
              {:x 440 :y 125 :w 50 :h 10}
              {:x 440 :y 140 :w 50 :h 10}
              {:x 440 :y 155 :w 50 :h 10}
              {:x 440 :y 170 :w 50 :h 10}
              {:x 440 :y 185 :w 50 :h 10}
              {:x 440 :y 200 :w 50 :h 10}
              {:x 440 :y 215 :w 50 :h 10}
              {:x 440 :y 230 :w 50 :h 10}
              {:x 440 :y 245 :w 50 :h 10}
              {:x 440 :y 260 :w 50 :h 10}
              {:x 440 :y 275 :w 50 :h 10}
              {:x 440 :y 290 :w 50 :h 10}
              {:x 440 :y 305 :w 50 :h 10}
              {:x 440 :y 320 :w 50 :h 10}
              {:x 500 :y 35 :w 50 :h 10}
              {:x 500 :y 50 :w 50 :h 10}
              {:x 500 :y 65 :w 50 :h 10}
              {:x 500 :y 80 :w 50 :h 10}
              {:x 500 :y 95 :w 50 :h 10}
              {:x 500 :y 110 :w 50 :h 10}
              {:x 500 :y 125 :w 50 :h 10}
              {:x 500 :y 140 :w 50 :h 10}
              {:x 500 :y 155 :w 50 :h 10}
              {:x 500 :y 170 :w 50 :h 10}
              {:x 500 :y 185 :w 50 :h 10}
              {:x 500 :y 200 :w 50 :h 10}
              {:x 500 :y 215 :w 50 :h 10}
              {:x 500 :y 230 :w 50 :h 10}
              {:x 500 :y 245 :w 50 :h 10}
              {:x 500 :y 260 :w 50 :h 10}
              {:x 500 :y 275 :w 50 :h 10}
              {:x 500 :y 290 :w 50 :h 10}
              {:x 500 :y 305 :w 50 :h 10}
              {:x 500 :y 320 :w 50 :h 10}
              {:x 560 :y 35 :w 50 :h 10}
              {:x 560 :y 50 :w 50 :h 10}
              {:x 560 :y 65 :w 50 :h 10}
              {:x 560 :y 80 :w 50 :h 10}
              {:x 560 :y 95 :w 50 :h 10}
              {:x 560 :y 110 :w 50 :h 10}
              {:x 560 :y 125 :w 50 :h 10}
              {:x 560 :y 140 :w 50 :h 10}
              {:x 560 :y 155 :w 50 :h 10}
              {:x 560 :y 170 :w 50 :h 10}
              {:x 560 :y 185 :w 50 :h 10}
              {:x 560 :y 200 :w 50 :h 10}
              {:x 560 :y 215 :w 50 :h 10}
              {:x 560 :y 230 :w 50 :h 10}
              {:x 560 :y 245 :w 50 :h 10}
              {:x 560 :y 260 :w 50 :h 10}
              {:x 560 :y 275 :w 50 :h 10}
              {:x 560 :y 290 :w 50 :h 10}
              {:x 560 :y 305 :w 50 :h 10}
              {:x 560 :y 320 :w 50 :h 10}
              {:x 620 :y 35 :w 50 :h 10}
              {:x 620 :y 50 :w 50 :h 10}
              {:x 620 :y 65 :w 50 :h 10}
              {:x 620 :y 80 :w 50 :h 10}
              {:x 620 :y 95 :w 50 :h 10}
              {:x 620 :y 110 :w 50 :h 10}
              {:x 620 :y 125 :w 50 :h 10}
              {:x 620 :y 140 :w 50 :h 10}
              {:x 620 :y 155 :w 50 :h 10}
              {:x 620 :y 170 :w 50 :h 10}
              {:x 620 :y 185 :w 50 :h 10}
              {:x 620 :y 200 :w 50 :h 10}
              {:x 620 :y 215 :w 50 :h 10}
              {:x 620 :y 230 :w 50 :h 10}
              {:x 620 :y 245 :w 50 :h 10}
              {:x 620 :y 260 :w 50 :h 10}
              {:x 620 :y 275 :w 50 :h 10}
              {:x 620 :y 290 :w 50 :h 10}
              {:x 620 :y 305 :w 50 :h 10}
              {:x 620 :y 320 :w 50 :h 10}
              {:x 680 :y 35 :w 50 :h 10}
              {:x 680 :y 50 :w 50 :h 10}
              {:x 680 :y 65 :w 50 :h 10}
              {:x 680 :y 80 :w 50 :h 10}
              {:x 680 :y 95 :w 50 :h 10}
              {:x 680 :y 110 :w 50 :h 10}
              {:x 680 :y 125 :w 50 :h 10}
              {:x 680 :y 140 :w 50 :h 10}
              {:x 680 :y 155 :w 50 :h 10}
              {:x 680 :y 170 :w 50 :h 10}
              {:x 680 :y 185 :w 50 :h 10}
              {:x 680 :y 200 :w 50 :h 10}
              {:x 680 :y 215 :w 50 :h 10}
              {:x 680 :y 230 :w 50 :h 10}
              {:x 680 :y 245 :w 50 :h 10}
              {:x 680 :y 260 :w 50 :h 10}
              {:x 680 :y 275 :w 50 :h 10}
              {:x 680 :y 290 :w 50 :h 10}
              {:x 680 :y 305 :w 50 :h 10}
              {:x 680 :y 320 :w 50 :h 10}
              {:x 740 :y 35 :w 50 :h 10}
              {:x 740 :y 50 :w 50 :h 10}
              {:x 740 :y 65 :w 50 :h 10}
              {:x 740 :y 80 :w 50 :h 10}
              {:x 740 :y 95 :w 50 :h 10}
              {:x 740 :y 110 :w 50 :h 10}
              {:x 740 :y 125 :w 50 :h 10}
              {:x 740 :y 140 :w 50 :h 10}
              {:x 740 :y 155 :w 50 :h 10}
              {:x 740 :y 170 :w 50 :h 10}
              {:x 740 :y 185 :w 50 :h 10}
              {:x 740 :y 200 :w 50 :h 10}
              {:x 740 :y 215 :w 50 :h 10}
              {:x 740 :y 230 :w 50 :h 10}
              {:x 740 :y 245 :w 50 :h 10}
              {:x 740 :y 260 :w 50 :h 10}
              {:x 740 :y 275 :w 50 :h 10}
              {:x 740 :y 290 :w 50 :h 10}
              {:x 740 :y 305 :w 50 :h 10}
              {:x 740 :y 320 :w 50 :h 10}
              {:x 800 :y 35 :w 50 :h 10}
              {:x 800 :y 50 :w 50 :h 10}
              {:x 800 :y 65 :w 50 :h 10}
              {:x 800 :y 80 :w 50 :h 10}
              {:x 800 :y 95 :w 50 :h 10}
              {:x 800 :y 110 :w 50 :h 10}
              {:x 800 :y 125 :w 50 :h 10}
              {:x 800 :y 140 :w 50 :h 10}
              {:x 800 :y 155 :w 50 :h 10}
              {:x 800 :y 170 :w 50 :h 10}
              {:x 800 :y 185 :w 50 :h 10}
              {:x 800 :y 200 :w 50 :h 10}
              {:x 800 :y 215 :w 50 :h 10}
              {:x 800 :y 230 :w 50 :h 10}
              {:x 800 :y 245 :w 50 :h 10}
              {:x 800 :y 260 :w 50 :h 10}
              {:x 800 :y 275 :w 50 :h 10}
              {:x 800 :y 290 :w 50 :h 10}
              {:x 800 :y 305 :w 50 :h 10}
              {:x 800 :y 320 :w 50 :h 10}
              {:x 860 :y 35 :w 50 :h 10}
              {:x 860 :y 50 :w 50 :h 10}
              {:x 860 :y 65 :w 50 :h 10}
              {:x 860 :y 80 :w 50 :h 10}
              {:x 860 :y 95 :w 50 :h 10}
              {:x 860 :y 110 :w 50 :h 10}
              {:x 860 :y 125 :w 50 :h 10}
              {:x 860 :y 140 :w 50 :h 10}
              {:x 860 :y 155 :w 50 :h 10}
              {:x 860 :y 170 :w 50 :h 10}
              {:x 860 :y 185 :w 50 :h 10}
              {:x 860 :y 200 :w 50 :h 10}
              {:x 860 :y 215 :w 50 :h 10}
              {:x 860 :y 230 :w 50 :h 10}
              {:x 860 :y 245 :w 50 :h 10}
              {:x 860 :y 260 :w 50 :h 10}
              {:x 860 :y 275 :w 50 :h 10}
              {:x 860 :y 290 :w 50 :h 10}
              {:x 860 :y 305 :w 50 :h 10}
              {:x 860 :y 320 :w 50 :h 10}
              {:x 920 :y 35 :w 50 :h 10}
              {:x 920 :y 50 :w 50 :h 10}
              {:x 920 :y 65 :w 50 :h 10}
              {:x 920 :y 80 :w 50 :h 10}
              {:x 920 :y 95 :w 50 :h 10}
              {:x 920 :y 110 :w 50 :h 10}
              {:x 920 :y 125 :w 50 :h 10}
              {:x 920 :y 140 :w 50 :h 10}
              {:x 920 :y 155 :w 50 :h 10}
              {:x 920 :y 170 :w 50 :h 10}
              {:x 920 :y 185 :w 50 :h 10}
              {:x 920 :y 200 :w 50 :h 10}
              {:x 920 :y 215 :w 50 :h 10}
              {:x 920 :y 230 :w 50 :h 10}
              {:x 920 :y 245 :w 50 :h 10}
              {:x 920 :y 260 :w 50 :h 10}
              {:x 920 :y 275 :w 50 :h 10}
              {:x 920 :y 290 :w 50 :h 10}
              {:x 920 :y 305 :w 50 :h 10}
              {:x 920 :y 320 :w 50 :h 10}])
