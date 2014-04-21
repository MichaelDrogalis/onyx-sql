(defproject onyx-sql "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [com.mchange/c3p0 "0.9.2.1"]
                 [com.mdrogalis/onyx "0.2.0-SNAPSHOT"]
                 [honeysql "0.4.3"]]
  :profiles {:dev {:dependencies [[midje "1.6.2"]
                                  [org.hornetq/hornetq-core-client "2.4.0.Final"]
                                  [mysql/mysql-connector-java "5.1.25"]
                                  [org.clojure/data.fressian "0.2.0"]]
                   :plugins [[lein-midje "3.1.3"]]}})
