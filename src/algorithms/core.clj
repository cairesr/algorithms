(ns algorithms.core)

(defn sequence-inverter
  "inverts the elements of the sequence"
  ([the-sequence]

    (loop [original-elements the-sequence
           inverted-elements '()]

      (if (empty? original-elements)
        inverted-elements
        (recur (rest original-elements) 
               (conj inverted-elements (first original-elements))))))
  ([] ()))

(defn max-value
  "Find the max value of a sequence"
  ([sequence]
    
    (loop [original-sequence sequence
           max-element       (first sequence)]

      (if (empty? original-sequence)
        max-element
        (recur (rest original-sequence)
               (if (>= max-element (first original-sequence))
                 max-element
                 (first original-sequence))))))
  ([] nil))

(defn average-of-seq-values
  "Calculates the average of the array values"
  ([original-sequence]
    (if (empty? original-sequence)
      nil
      (loop [sequence     original-sequence
             elements-sum 0]

        (if (empty? sequence)
          (/ elements-sum (count original-sequence))
          (recur (rest sequence) (+ elements-sum (first sequence)))))))
  ([] nil))
