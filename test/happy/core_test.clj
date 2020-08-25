(ns happy.core-test
  (:require [clojure.test :refer :all]
            [happy.core :refer :all]))


(deftest is-happy-number
  (testing "7 is a happy number"
    (is (= false (happy-number?  7)))))

