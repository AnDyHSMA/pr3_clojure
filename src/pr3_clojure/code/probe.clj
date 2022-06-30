(defn fact [n]
  (cond
    (= n 0) 1
    (> n 0) (* n (fact (- n 1)))))

(print (fact 5))