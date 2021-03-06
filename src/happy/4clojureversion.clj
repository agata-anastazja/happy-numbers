(fn [number]
  (loop [ number number
         acc   []]
    ( let [digits (map #(Character/digit ^Character % 10) (str number))
           squared-sum  (reduce + (map (fn [number] (* number number)) digits))
           happy-number (= squared-sum 1)
           this-squared-sum-appeared-before  (and (not (empty? acc)) (contains? acc squared-sum))]
      (case [happy-number this-squared-sum-appeared-before]
        [true true]  true
        [true false] true
        [false true] false
        (do (println squared-sum acc)
            (recur squared-sum (conj acc squared-sum)))))))
