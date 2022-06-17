(comment "
   Das Spiel wurde von Team 05 entwickelt.

   Ablauf
      Das Spiel geht über drei Runden.
      Es fragt den Spieler nach seiner Auswahl (r, p, s).
      Der Computer zieht zufällig eine der drei Möglichkeiten.
      Nach jeder Runde sagt das Spiel, wer welche Möglichkeit gewählt hat und wer die Runde gewonnen hat.
      Ein Sieg bringt einen Punkt, ein Unentschieden 0 Punkte.
      Die Punkte jeder Runde werden addiert.
      Am Ende wird der Gesamtpunktestand ausgegeben.
  ")

(def m {:r ":ROCK" :p ":PAPER" :s ":SCISSORS"})
(def u-punkte (atom 0))
(def pc-punkte (atom 0))

;; Funktionen ermittelt rundenweise den Gewinner
(defn spiel []
  (loop [n 1]
    (when (<= n 3)
      (println "Dein Zug ([r]rock, [p]aper, [s]cissors)?")
      (def u-zug (read-line))
      (def pc-zug (first (shuffle ["r" "p" "s"])))

      (if (= u-zug pc-zug)
        (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Unentschieden"))

      (if (and (= u-zug "r") (= pc-zug "s"))
        (do
          (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Du hast gewonnen")
          (swap! u-punkte inc)))

      (if (and (= u-zug "s") (= pc-zug "r"))
        (do
          (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Der Computer hat gewonnen")
          (swap! pc-punkte inc)))

      (if (and (= u-zug "p") (= pc-zug "r"))
        (do
          (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Du hast gewonnen")
          (swap! u-punkte inc)))

      (if (and (= u-zug "r") (= pc-zug "p"))
        (do
          (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Der Computer hat gewonnen")
          (swap! pc-punkte inc)))

      (if (and (= u-zug "s") (= pc-zug "p"))
        (do
          (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Du hast gewonnen")
          (swap! u-punkte inc)))

      (if (and (= u-zug "p") (= pc-zug "s"))
        (do
          (println "Runde" n ": Du" (m (keyword u-zug)) "- Computer" (m (keyword pc-zug)) "-> Der Computer hat gewonnen")
          (swap! pc-punkte inc)))

      (recur (inc n)))))

;; Gewinner wird ermittelt
(defn gewinner []
  (if (= @u-punkte @pc-punkte)
    (println "Unentschieden - Du " @u-punkte "Punkt(e), Computer " @pc-punkte "Punkt(e)"))

  (if (> @u-punkte @pc-punkte)
    (println "Du hast gewonnen - Du" @u-punkte "Punkt(e), Computer " @pc-punkte "Punkt(e)"))

  (if (< @u-punkte @pc-punkte)
    (println "Der Computer hat gewonnen - Du" @u-punkte "Punkt(e), Computer" @pc-punkte "Punkt(e)")))

(spiel)
(gewinner)
