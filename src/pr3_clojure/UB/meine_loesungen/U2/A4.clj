(ns pr3-clojure.UB.meine-loesungen.U2.A4)

(defn sqrt [n]
  {:pre [(>= n 0)] :post [(> % 0)]}
  (Math/sqrt n))

(println (sqrt 4))
