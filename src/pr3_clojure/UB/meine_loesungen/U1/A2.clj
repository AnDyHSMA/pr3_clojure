(ns pr3-clojure.UB.meine-loesungen.U1.A2)

(println "Produktname eingeben: ")
(def produkt (read-line))
(println "Einkaufspreis eingeben: ")
(def p_E (Integer/parseInt (read-line)))
(def p_V (max(* 2.5 p_E), 995))
(println "Sonderangebot für" produkt ":" p_V)
