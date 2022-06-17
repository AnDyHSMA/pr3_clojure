(comment "
  Das Programm wurde von Team 05 entwickelt.

  Bereitgestellte Tools:
  Zufallszahlengenerators aus der Straßenbahn.

  Vorgaben:
  1. Berechnen Sie 100000000 Zufallszahlen im Bereich von 0-9999.
  2. Speichern Sie, wie häufig jede Zahl gezogen wurde in einem Vektor.
  3. Normieren Sie die Daten im Vektor so, dass die prozentuale Abweichung (positiv wie negativ)
     vom Ideal einer Gleichverteilung für jede Zahl gespeichert ist.
  4. Berechnen Sie über alle Elemente des Vektors die Wurzel aus der Summe der Quadrate der Elemente.
  5. Geben Sie das Ergebnis für die beiden Zufallsgeneratoren aus.

  Fragestellung:
  Zu welchem Urteil kommen Sie bezüglich der Qualität des Zufallszahlengenerators aus der Straßenbahn?
  ")

(println "---------- Zufallsgenerator der Gruppe 05 ----------")

; definiere Reichweite der gezogenen Zahlen von 0 bis n
(def reichweite 4)

; definiere Anzahl der Ziehungen
(def anzahl-ziehungen 12)

; generiere Liste mit bestimmten Anzahl der Zufallszahlen
(def liste (repeatedly anzahl-ziehungen #(rand-int reichweite)))
(println "Liste: " liste)

; speichere Häufigkeiten in einen Vektor
(defn haeufigkeit-vektor []
  (loop [i 0 vektor []]
    (if (< i reichweite)
      (recur (inc i) (conj vektor (count (filter #(= % i) liste))))
      vektor)))

; berechne Summe der Haeufigkeiten
(def summe-haeufigkeit (reduce #(+ %1 %2) 0 (haeufigkeit-vektor)))

; berechne Wahrscheinlichkeit einzelner Zahlen 1/n mit n = Anzahl der Zahlen
(def wahrscheinlichkeit (/ 1 reichweite))

; berechne erwartete Häufigkeit
(def erwartet (int (* wahrscheinlichkeit summe-haeufigkeit)))


; gebe Tabelle aus
(println "Zahl" "Haeufigkeit" "erwartet" "abs Abw." "rel Abw." "  ^2")
(dotimes [n reichweite]
  (def haeufigkeit (count (filter #(= % n) liste)))
  (def abs-abweichung (- haeufigkeit erwartet))
  (def rel-abweichung (float (/ abs-abweichung erwartet)))
  (def hoch-zwei (Math/pow rel-abweichung 2))
  (println n "  " haeufigkeit "         " erwartet "      " abs-abweichung "      " (format "%.3f" rel-abweichung) "    " (format "%.3f" hoch-zwei)))

; speichere Hoch-Zwei in einen Vektor
(defn hoch-zwei-vektor []
  (loop [j 0 vektor2 []]
    (def haeufigkeit2 (count (filter #(= % j) liste)))
    (def abs-abweichung2 (- haeufigkeit erwartet))
    (def rel-abweichung2 (float (/ abs-abweichung2 erwartet)))
    (def hoch-zwei2 (Math/pow rel-abweichung2 2))
    (if (< j reichweite)
      (recur (inc j) (conj vektor2 hoch-zwei2))
      vektor2)))

; berechne Fehler des Generators
(def fehler (Math/sqrt (reduce #(+ %1 %2) 0 (hoch-zwei-vektor))))

(println "Fehler =" (format "%.4f" fehler))


;----------------------------------------------------------------------------------------------------------------------------------------------------------
(println "------- Zufallsgenerator aus der Straßenbahn -------")

; definiere Reichweite der gezogenen Zahlen von 0 bis n
(def reichweite 4)

; definiere Anzahl der Ziehungen
(def anzahl-ziehungen 12)

(defn srand-int [max]
  "Generate a new random number between 0 and `max` (exklusive)"
  (let [a (int (rand max))
        b (int (rand max))]
    (int (/ (+ a b) 2))))

; generiere Liste mit bestimmten Anzahl der Zufallszahlen
(def liste (repeatedly anzahl-ziehungen #(srand-int reichweite)))
(println "Liste: " liste)

; speichere Häufigkeiten in einen Vektor
(defn haeufigkeit-vektor []
  (loop [i 0 vektor []]
    (if (< i reichweite)
      (recur (inc i) (conj vektor (count (filter #(= % i) liste))))
      vektor)))

; berechne Summe der Haeufigkeiten
(def summe-haeufigkeit (reduce #(+ %1 %2) 0 (haeufigkeit-vektor)))

; berechne Wahrscheinlichkeit einzelner Zahlen 1/n mit n = Anzahl der Zahlen
(def wahrscheinlichkeit (/ 1 reichweite))

; berechne erwartete Häufigkeit
(def erwartet (int (* wahrscheinlichkeit summe-haeufigkeit)))

; gebe Tabelle aus
(println "Zahl" "Haeufigkeit" "erwartet" "abs Abw." "rel Abw." "  ^2")
(dotimes [n reichweite]
  (def haeufigkeit (count (filter #(= % n) liste)))
  (def abs-abweichung (- haeufigkeit erwartet))
  (def rel-abweichung (float (/ abs-abweichung erwartet)))
  (def hoch-zwei (Math/pow rel-abweichung 2))
  (println n "  " haeufigkeit "         " erwartet "      " abs-abweichung "      " (format "%.3f" rel-abweichung) "    " (format "%.3f" hoch-zwei)))

; speichere Hoch-Zwei in einen Vektor
(defn hoch-zwei-vektor []
  (loop [j 0 vektor2 []]
    (def haeufigkeit2 (count (filter #(= % j) liste)))
    (def abs-abweichung2 (- haeufigkeit erwartet))
    (def rel-abweichung2 (float (/ abs-abweichung2 erwartet)))
    (def hoch-zwei2 (Math/pow rel-abweichung2 2))
    (if (< j reichweite)
      (recur (inc j) (conj vektor2 hoch-zwei2))
      vektor2)))

; berechne Fehler des Generators
(def fehler (Math/sqrt (reduce #(+ %1 %2) 0 (hoch-zwei-vektor))))

(println "Fehler =" (format "%.4f" fehler))

(comment "
  Fazit: Der Zufallsgenerator aus der Straßenbahn hat eine höhere Fehlerquote! Jedoch kommt es bei einer vorgegebenen
  Zahl von 100000000 zu einer Exception (java.lang.OutOfMemoryError).
")