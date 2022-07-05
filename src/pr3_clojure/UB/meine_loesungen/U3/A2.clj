(ns pr3-clojure.UB.meine-loesungen.U3.A2)

(def generationen 14)

(defn fib [n]
  {:pre [(>= n 0)] :post [(>= % 0)]}
     (loop [zahl1 0 zahl2 1 step n]
       (cond
         (= step 0) zahl1
         :else (recur zahl2 (+ zahl1 zahl2) (dec step)))))

(defn fibs [n]
  {:pre [(>= n 0)]}
  (let [vektor (range (inc n))]
    (map #(fib %) vektor)))

(println (fibs 5))

(defn kaninchen []
  (println "Nach" generationen "Generationen haben wir" (fib generationen) "Kaninchen")
  (println "Die Population entwickelt sich so:" (fibs generationen)))

(kaninchen)