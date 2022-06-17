(comment "
  Die Abzock GmbH ist sehr zufrieden mit Ihnen, sodass Sie jetzt die Lagerverwaltung optimieren sollen.
  Aktuell hat die Firma nur drei Artikel auf Lager: PlayStation 5 (10 Stück), Grafikkarten vom Typ GTX1090 (20 Stück) und Sonnenblumenöl (300 Flaschen).
  Verwenden Sie als Schlüssel die Keywords :PS5, :GTX1090 und :OEL.
  + Legen Sie ein Clojure-Skript abzock−lager.clj an
  + Implementieren Sie das Lager als Map im Programm mit den Keywords als Key und dem Bestand als Wert
  + Fragen Sie auf der Kommandozeile nach Warenabgängen
  + Ziehen Sie den Warenabgang vom Lager ab und geben Sie die neuen Bestände aus
  + Hinweis: Obwohl nicht sauber, dürfen Sie hier dasselbe Symbol mehrfach mit einem def überschreiben.
    Versuchen Sie nicht die Map mit update zu verändern, sondern entfernen Sie den Schlüssel und fügen Sie ihn danach mit dem neuen Bestand wieder ein.

    Lagerverwaltung Abzock GmbH
    Welcher Artikel wurde geliefert:
    PS5
    Wieviel wurde ausgeliefert?
    5
    Neuer Lagerbestand
    {:GTX1090 20, :OEL 300, :PS5 5}
")

(println "Lagerverwaltung Abzock GmbH")
(def lager {"PS5" 10, "GTX1090" 20, "OEL" 300})
(println "Welcher Artikel wurde ausgeliefert:")
(def artikel (read-line))
(println "Wieviel wurde ausgeliefert?")
(def anzahl-artikel (read))
(println "Neuer Lagerbestand")
(def new-lager (update lager artikel #(- % anzahl-artikel)))
(println new-lager)


