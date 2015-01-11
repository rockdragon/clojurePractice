(def numbers (range 1 11))
(println (filter (fn [x] (= 0 (rem x 3))) numbers))

(def words ["the" "quick" "brown" "fox" "jumped" "over" "the" "lazy" "dog"])
(println (filter #(zero? (rem (count %) 3)) words))
(println (map #(str % " appended text.") words))

(println (flatten [["w" "oo" "!"] ["brilliant" "."]]))

(println (reduce + (range 1 11)))

;library ref: r/fold
(require '[clojure.core.reducers :as r])
(println (r/fold str words))