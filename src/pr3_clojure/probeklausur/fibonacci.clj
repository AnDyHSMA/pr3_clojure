(ns pr3-clojure.probeklausur.fibonacci)

(defn fib
  "Berechnet die Fibonacci-Zahl nach `n` Schritten."
  [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))))

(print (fib 9))
; Testfälle
(assert (= [0 1 1 2 3 5 8 13 21 34]
           [(fib 0) (fib 1) (fib 2) (fib 3) (fib 4)
            (fib 5) (fib 6) (fib 7) (fib 8) (fib 9)]))
