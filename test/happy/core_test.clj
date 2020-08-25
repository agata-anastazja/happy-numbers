(ns happy.core-test
  (:require [clojure.test :refer :all]
            [happy.core :refer :all]))


(deftest is-happy-number
  (testing "7 is a happy number"
    (is (= true (happy-number?  7))))

  (testing "986543210 is a happy number"
    (is (= true (happy-number?  986543210))))

  (testing "2 is not a happy number"
    (is (= false (happy-number?  2))))

  (testing "3 is not a happy number"
    (is (= false (happy-number?  3))))

  )

