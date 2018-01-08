(ns user
  (:require [mount.core :as mount]
            example-project.core))

(defn start []
  (mount/start-without #'example-project.core/http-server
                       #'example-project.core/repl-server))

(defn stop []
  (mount/stop-except #'example-project.core/http-server
                     #'example-project.core/repl-server))

(defn restart []
  (stop)
  (start))


