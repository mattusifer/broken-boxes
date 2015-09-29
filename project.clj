(defproject clojure-breakout "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [thi.ng/geom "0.0.881"]
                 [quil "2.2.6"]
                 [net.cgrand/utils "0.1.0-SNAPSHOT"]]
  :main ^:skip-aot clojure-breakout.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
