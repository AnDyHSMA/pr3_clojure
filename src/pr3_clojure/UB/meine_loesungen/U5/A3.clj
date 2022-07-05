(ns pr3-clojure.UB.meine-loesungen.U5.A3)

(defn below-zero
  "Läuft über `data` und gibt die Elemente bis zum ersten
   Auftreten eines Wertes >= 0 zurück."
  [data]
  (take-while #(< % 0) data))

(println (below-zero '(-1 -2 -3 3 -4 -5))) ; -> (-1 -2 -3)


