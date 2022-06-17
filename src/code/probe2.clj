(use 'clojure.pprint 'clojure.reflect)

(def x (:members (reflect clojure.lang.BigInt)))

(print-table [:name :type :flags] (sort-by :name x))
