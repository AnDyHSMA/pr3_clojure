(ns pr3-clojure.UB.meine-loesungen.U5.A1)

(defn prod-reduce
  "Berechnet das Produkt einer Reihe von Zahlen `zahlen` unter
  Verwendung von reduce."
  [zahlen]
  (reduce * zahlen)
  )

(println (prod-reduce '(1 2 3 4 5)))
