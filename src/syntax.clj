(def numbers (range 1 11))
(println (filter (fn [x] (= 0 (rem x 3))) numbers))

(def words ["the" "quick" "brown" "fox" "jumped" "over" "the" "lazy" "dog"])
(println (filter #(zero? (rem (count %) 3)) words))
(println (map #(str % " appended text.") words))