(ns pr3-clojure.UB.meine-loesungen.U1.A4)

(println "Lagerverwaltung Abzock GmbH")
(def lager {:PS5 10, :GTX1090 20, :OEL 300})
(println "Welcher Artikel wurde geliefert? ")
(def artikel (keyword (read-line)))
(println "Wieviel wurde geliefert? ")
(def stueckzahl (Integer/parseInt (read-line)))

(def stueckzahl-alt (artikel lager))
(def stueckzahl-neu (- stueckzahl-alt stueckzahl))

(if (< stueckzahl-neu 0)
  (println "Nicht genug auf Lager")
  (do
    (def lager (dissoc lager artikel))
    (def lager (assoc lager artikel stueckzahl-neu))))

(print "Neuer Lagerbestand: ")
(println lager)