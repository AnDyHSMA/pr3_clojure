(ns pr3-clojure.probeklausur.my-average)

(defn my-average
  ([a b] (/ (+ a b) 2))
  ([a b c] (/ (+ a b c) 3))
  ([a b c d] (/ (+ a b c d) 4)))

; Testfälle
(assert (= 5     (my-average 5 5)))
(assert (= 15/2  (my-average 10 5)))
(assert (= 4     (my-average 3 4 5)))
(assert (= 9/2   (my-average 3 4 5 6)))
