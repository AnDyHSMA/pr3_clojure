(ns pr3-clojure.UB.meine-loesungen.U5.A2)

(defn map-cycle
  "Erzeugt eine unendliche Sequenz der Zahlen `zahlen`
  und berechnet für jede Zahl deren Doppeltes und zieht
  1 ab. Vom Ergebnis werden `n` Elemente zurück
  gegeben."
  [n & zahlen]
  (take n (map #(dec (* % 2)) (cycle zahlen)))) ; take gibt die ersten n Elemente aus, cycle wiederholt unendlich die Zahlenfolge

(println (map-cycle 10 1 2))
