(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Você perdeu"))
(defn ganhou [] (print "Você ganhou!"))

(defn letras-faltantes [palavras acertos]
	(remove (fn [letras] (contains? acertos (str letra))) palavra)
)

(defn acertou-a-palavra-toda? [palavra acertos]
	(empty? (letras-faltantes palavra acertos))
)

(defn le-letra! [] (read-line))

(defn acertou? [chute palavra] (.contains palavra chute))

(defn jogo [vidas]
	(cond
			(= vidas 0) (perdeu)
			(acertou-a-palavra-toda? palavra acertos) (ganhou)
			:else
			(let [chute (le-letra!)]
				(if (acertou? chute palavra)
					(do
							(println "Acertou a letra!")
							(recur vidas palavra (conj acertos chute)))
					(do
							(println "Errou a letra! Perdeu vida!")
							(recur (dec vidas) palavra acertos))
				)		
			)
	)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
