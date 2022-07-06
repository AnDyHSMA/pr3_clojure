(def verkaeufe-stueckzahlen {
                             :PS5     [10, 5, 8, 13, 22, 42, 110],
                             :GTX1090 [5, 7, 11, 54, 90],
                             :OEL     [10, 44, 100, 343, 66, 52, 23]})

(def verkaufspreise {
                     :PS5     1239,
                     :GTX1090 1699,
                     :OEL     9})

(defn summe [vs vp]
  (doseq [[k v] vs]
    (println (reduce + (map #(* % (k vp)) v)))))

(summe verkaeufe-stueckzahlen verkaufspreise)












