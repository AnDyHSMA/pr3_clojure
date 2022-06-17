;; defines a random int between 0 and 100
(def randInt (+ 1 (rand-int 100)))
;; just a variable to break out of the loop after the user got the randInt
(def untraceableNumber true)
;; maximum attempts before the "bot" will quit the game
(def maxAttempts 101)
;; our attempts counter
(def counter 0)
;; while until the user got the number or the maximum attempts is reached
(while untraceableNumber
  ;; increment counter
  (def counter (inc counter))
  (if (= counter maxAttempts)
  ;; if maximum attempts reached
   (do
 ;; loop breaker
    (def untraceableNumber false)
    (println "\n\n\nYou're too stupid for this game. The Bot will crush it! BYE!\n\n\n"))
    ;; if maximum attempts not reached
   (do
    (println "\nPlease type a number between 1 and 100:")
      ;; wait until user input and safe the input
    (def input (read-line))
    (try
        (if (< (Integer/parseUnsignedInt input) randInt) (println "Your number is too low."))
        (if (> (Integer/parseUnsignedInt input) randInt) (println "Your number is too high"))
        (if (= (Integer/parseUnsignedInt input) randInt)
         (do
 ;; loop breaker
          (def untraceableNumber false)
          (println "\n\n\nYou got it in" counter "attempts! Congratulation!\n\n\n")))
     (catch NumberFormatException e
      (println "Only numbers are accepted!"))))))

;; exit program
(System/exit 0)