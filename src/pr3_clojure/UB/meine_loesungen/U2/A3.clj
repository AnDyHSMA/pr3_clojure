(ns pr3-clojure.UB.meine-loesungen.U2.A3)

(defn triple-apply
  "Wendet die Funktion `f` dreimal hintereinander auf die Argumente
  `args` an und gibt die Summe der Ergebnisse zurück."
  [f & args]
  (+ (* 3 (apply f args))))

(println (triple-apply #(+ %1 %2 %3) 1 2 3))