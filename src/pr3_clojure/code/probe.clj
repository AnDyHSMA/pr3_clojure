(defn summe-berechnen [liste]
   (loop [ergebnis 0 rest-liste liste]
   (if (> (count rest-liste) 0)
      (recur (+ ergebnis (first rest-liste)) (rest liste))
      ergebnis)))

(println (summe-berechnen '(1 2 3 4 5)))

