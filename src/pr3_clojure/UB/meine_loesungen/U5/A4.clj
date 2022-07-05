(ns pr3-clojure.UB.meine-loesungen.U5.A4)

(defn filter-positive
  "Läuft über `data` und gibt die Elemente, deren Wert >= 0 ist zurück."
  [data]
  (filter #(>= % 0) data))

; Testfälle
(assert (= [1 2 3 4 0 5 6] (filter-positive [1 2 3 4 0 5 6])))
(assert (= [2 3]           (filter-positive '(-1 2 3 -4))))
(assert (= [42 0 42]       (filter-positive '(42 -23 0 -23 42))))
