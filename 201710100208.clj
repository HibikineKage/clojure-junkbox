;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(first (.getBytes "hello"))
(rest (.getBytes "hello"))
(cons (int \h) (.getBytes "hello"))
(first "hello")
(rest "hello")
(apply str (reverse "hello"))
(reverse "hello")

(cons \H "ello")
(re-seq #"\w+" "the quick brown fox")
(def tqbf "the quick brown fox")
(sort (re-seq #"\w+" tqbf))
(drop 2 (re-seq #"\w+" tqbf))
(map #(.toUpperCase %) (re-seq #"\w+" tqbf))
(import '(java.io File))
(.listFiles (File. "."))
(seq (.listFiles (File. ".")))
(map #(.getName %) (seq (.listFiles (File. "."))))
(map #(.getName %) (.listFiles (File. ".")))
(count (file-seq (File. ".")))
(defn minutes-to-mills [mins] (* mins 1000 60))
(defn recentry-modified? [file]
  (> (.lastModified file)
     (- (System/currentTimeMillis) (minutes-to-mills 30))))
(filter recentry-modified? (file-seq (File. ".")))
(use '[cloure.java.io :only (reader)])

