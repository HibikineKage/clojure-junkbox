(def row-size 5)
(take 3 (repeat 5))
(+ 1 3 3 4)
(defn generate-row [row_num] (take row-size (repeat row_num)))
(generate-row 1)
(def battle-map
  (join
    (generate-row 1)
    ()))
(cons [5 56] [23 5])
(conj [345 2] [3 2])
()
(def inited-row (vec (take 5 (repeat 0))))
(def inited-board (vec (take 5 (repeat inited-row))))
(defn init-player [column player-id board] (
  let
  [splited-board (split-at column board)]
  (into
    (first splited-board)
    (cons
      (vec
        (take
          (count (first board))
          (repeat player-id)))
      (rest (last splited-board))))))
(def init-players (
  (init-player 0 1 (init-player 4 2 inited-board))))
(defn init-multi-zero-vec [x]
    (if (= 0 (count x))
      0
      (vec (take (first x)
        (repeat
          (init-multi-zero-vec (rest x)))))))

(init-multi-zero-vec 5)

(defn add [x y] (+ x y))
(reduce add [2 3 4 5 6])
(defn double [x] (* x 2))
(map double [1 2 3 4 5])



(inc 3)
