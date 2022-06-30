(ns pr3-clojure.UB.meine-loesungen.U2.A2)

(defn plus-n-fn
  "Liefert eine Funktion zurück, die genau ein
  Argument nimmt und dieses Argument zu
  `n` addiert."
  [n]
  #(+ % n))

(println ((plus-n-fn 4) 3))
