(ns pr3-clojure.UB.meine-loesungen.U3.A1)

(defn prod-recur
  "Berechnet das Produkt einer Reihe von Zahlen `zahlen` unter
  Verwendung von loop und recur."
  [zahlen]
  (loop [produkt 1 rest-liste zahlen]
    (if (seq rest-liste)
      (recur (* produkt (first rest-liste)) (rest rest-liste))
      produkt)))

(println (prod-recur [1 2 3 4 5]))