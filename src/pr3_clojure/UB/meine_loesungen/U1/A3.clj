(ns pr3-clojure.UB.meine-loesungen.U1.A3)

(println "Lagerverwaltung Abzock GmbH")
(def lager {:PS5 10, :GTX1090 20, :OEL 300})
(println "Welcher Artikel wurde geliefert? ")
(def artikel (keyword (read-line)))
(println "Wieviel wurde geliefert? ")
(def stueckzahl (Integer/parseInt (read-line)))

(def stueckzahl-alt (artikel lager))
(def stueckzahl-neu (- stueckzahl-alt stueckzahl))
(def lager (dissoc lager artikel))
(def lager (assoc lager artikel stueckzahl-neu))

(println "Neuer Lagerbestand: ")
(println lager)
