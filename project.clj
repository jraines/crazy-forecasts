(defproject weatherfu "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[csv-map "0.1.2"]
                 [org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot weatherfu.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
