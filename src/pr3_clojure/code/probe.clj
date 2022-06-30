(defn my-average [& rest]
   (/ (reduce + rest) (count rest)))

(println (my-average 6 4))
(println (my-average 6 4 6 4))
(println (my-average 6 4 6 4 6 4))