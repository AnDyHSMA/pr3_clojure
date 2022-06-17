(ns pr3-clojure.junit_tests.shop-test
  (:require [clojure.test :refer :all])
  (:require [pr3-clojure.junit_tests.shop]))

(deftest test-rabatt
  (testing "Neuer Preis"
    (is (= (long (pr3-clojure.junit_tests.shop/rabatt pr3-clojure.junit_tests.shop/boot 20)) 600) "Die Berechnung ist falsch!")))