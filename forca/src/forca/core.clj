(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Você perdeu"))
(defn ganhou [] (print "Você ganhou!"))

(defn letras-faltantes [palavras acertos])

(defn acertou-a-palavra-toda? [palavra acertos]

)

(defn jogo [vidas]
	(if (= vidas 0)
		(perdeu)
		(if (acertou-a-palavra-toda? palavra acertos)
			(ganhou)
			(print "Chuta, amigo!")	
		)
	)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
