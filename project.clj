(defproject fipp "0.6.1-SNAPSHOT"
  :description "Fast Idiomatic Pretty Printer for Clojure"
  :url "https://github.com/brandonbloom/fipp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 ;; Used on JVM.
                 [org.clojure/data.finger-tree "0.0.2"]
                 ;; Used for JS.
                 [org.clojure/core.rrb-vector "0.0.11"]])
