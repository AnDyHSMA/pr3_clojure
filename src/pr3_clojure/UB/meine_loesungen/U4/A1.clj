(ns pr3-clojure.UB.meine-loesungen.U4.A1)

(defn test-positive
  "Vergleicht eine Zahl mit 0 gibt einen Hinweis-Text.
  Der Hinweistext erklärt, ob die Zahl `number` größer, kleiner
  oder gleich zur Zahl 0 ist."
  [number]
  (cond
    (= number 0) "Null"
    (< number 0) "Kleiner"
    :else "Größer"
  ))

(println (test-positive 2))
