(def ^:dynamic *antwort* 42)

(defn print-antwort []
  (println *antwort*))

(binding [*antwort* 23]
  (print-antwort))