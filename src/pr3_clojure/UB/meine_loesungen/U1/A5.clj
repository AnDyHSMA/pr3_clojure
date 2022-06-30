(ns pr3-clojure.UB.meine-loesungen.U1.A5)

(def verkaeufe-stueckzahlen {:PS5 [10, 5, 8, 13, 22, 42, 110], :GTX1090 [5, 7, 11, 54, 90], :OEL [10, 44, 100, 343, 66, 52, 23]})
(def verkaufspreise {:PS5 1239, :GTX1090 1699, :OEL 9})

(println "Gewinnermittlung Abzock GmbH")
(defn summiere [verkaeufe-stueckzahlen verkaufspreise]
  (doseq [[key values] verkaeufe-stueckzahlen]
    (println key (reduce + (map #(* % (key verkaufspreise)) values)) "EUR")))

(summiere verkaeufe-stueckzahlen verkaufspreise)
