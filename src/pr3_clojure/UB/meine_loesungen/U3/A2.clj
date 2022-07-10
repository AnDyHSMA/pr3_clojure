(ns pr3-clojure.UB.meine-loesungen.U3.A2)

(def generationen 14)

(defn fib [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else
    (loop [zahl1 0 zahl2 1 step n]
      (if (= step 0)
        (print zahl1)
        (recur zahl2 (+ zahl1 zahl2) (dec step))))))

(defn fibs [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else
    (loop [zahl1 0 zahl2 1 schritte n]
      (if (> schritte 0)
        (do
          (print zahl1 " ")
          (recur zahl2 (+ zahl1 zahl2) (dec schritte)))
        (println zahl1)))))

(defn kaninchen []
  (print "Nach" generationen "Generationen haben wir ")
  (fib generationen)
  (println " Kaninchen")
  (print "Die Population entwickelt sich so: ")
  (fibs generationen))

(kaninchen)