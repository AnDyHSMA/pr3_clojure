(ns pr3-clojure.UB.meine-loesungen.U4.A2)

(defn number-formatter
  "Konvertiert den String `string` in einen Integer-Wert.
  Wenn die Konvertierung fehlschlägt, wird -1 zurück
  gegeben."
  [string]
  (try
    (Integer/parseInt string)
    (catch Exception e -1)))

(println (number-formatter "4"))
