(ns happy.core)


(defn num->digits [n]
  (map #(Character/digit ^Character % 10) (str n) ))

(defn get-squared-sum [numberSeq]
  (reduce + (map (fn [number] (* number number)) numberSeq)))

(defn has-this-squared-sum-appeared-before? [coll num]
  (and (not (empty? coll)) (contains? coll num)))

(defn happy-number? [number]
  (loop [ number number
         acc   []]
    ( let [digits (num->digits number)
           squared-sum  (get-squared-sum digits)
           happy-number (= squared-sum 1)
           this-squared-sum-appeared-before (has-this-squared-sum-appeared-before? acc squared-sum)]
      (case [happy-number this-squared-sum-appeared-before]
        [true true]  true
        [true false] true
        [false true] false
        (do
           (recur squared-sum (conj acc squared-sum)))))))
