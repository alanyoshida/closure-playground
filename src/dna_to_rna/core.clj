(ns dna-to-rna.core
  (:require [dna-to-rna.converter :as converter])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (converter/hello "Alan")))

(converter/to-rna ["G" "C" "A" "T"])