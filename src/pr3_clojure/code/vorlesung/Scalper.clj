(comment "
  Sie haben einen Nebenjob als Programmierer*in bei der Abzock GmbH,
  einem bekannten PlayStation 5-Scalper. Sie sollen ein kleines
  Clojure-Programm für die Preisgestaltung auf der Webseite der Firma schreiben.
  Legen Sie ein Clojure-Skript scalper.clj an
  Das Skript fragt (read−line) nach einem Produktnamen und nach einem Einkaufs-Preis pE
  Es gibt den Produktnamen mit Verkaufspreis (pV) aus (print und println)
  Es gilt pV = max(2.5 · pE, 995)
  Hinweis: Verwenden Sie Integer/parseInt für die Umwandlung des
  Einkaufspreises und max für die Berechnung des Maximums
")
(println "Produktname eingeben")
(def p-name (read-line))
(println "Einkaufspreis eingeben")
(def e-preis (Integer/parseInt (read-line)))
(println "Sonderangebot:" p-name "für nur " (max (* 2.5 e-preis) 995) "EUR")



