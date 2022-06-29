(ns pr3-clojure.probeklausur.above-zero)

(defn above-zero
  "Läuft über `data` und gibt die Elemente bis zum ersten
   Auftreten eines Wertes kleiner als 0 zurück."
  [data]
  (take-while #(> % 0) data))

; Testfälle
(assert (= [1 2 3 4] (above-zero [1 2 3 4 0 5 6])))
(assert (= []        (above-zero '(-1 2 3 4))))
(assert (= [42 23]   (above-zero '(42 23 0 23 42))))
