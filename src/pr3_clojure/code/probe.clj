(ns code.probe
  (:require [clojure.test :refer :all]))

(defprotocol Rabatt (rabatt [produkt menge]))
(defrecord Produkt [name preis])

(extend-protocol Rabatt Produkt
  (rabatt [produkt menge] (- (:preis produkt) (* (/ menge 100) (:preis produkt)))))

(def boot (->Produkt "SUP" 1000))
(println "Neuer Preis:" (long (rabatt boot 20)) "Euro")


