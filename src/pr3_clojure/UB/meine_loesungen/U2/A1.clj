(ns pr3-clojure.UB.meine-loesungen.U2.A1)

(defn my-average
  ([a b] (/ (+ a b) 2))
  ([a b c d] (/ (+ a b c d) 4))
  ([a b c d e f] (/ (+ a b c d e f) 6)))

(println (my-average 6 4))
(println (my-average 6 4 6 4))
(println (my-average 6 4 6 4 6 4))

