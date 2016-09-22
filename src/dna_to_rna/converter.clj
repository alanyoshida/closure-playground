(ns dna-to-rna.converter)

(defn hello
	[person]
	(str "Hello " person))

(def dna-to-rna { 
  :G \C
  :C \G
  :T \A
  :A \U
  })

(defn valid-dna? [nucleotide]
  (contains? dna-to-rna nucleotide))

(defn to-rna
  [cadeia]
  (println 
    (map 
      (fn 
        [nucleotide] 
        (get 
          dna-to-rna 
          (keyword nucleotide)))
    cadeia)))
