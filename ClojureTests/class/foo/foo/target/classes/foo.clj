(ns foo
  (:gen-class
    :methods [#^{:static true} [bar [string] String]
              #^{:static true} [fuga [] void]
              [echo [String] String]]))

(defn -main [] (println "Hello World Main Method"))
(defn -bar [name] (str "Hello World By " name " !!"))
(defn -fuga [] (println "Hello World"))

(defn -echo [this param] param)