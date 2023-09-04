# CS.12.01-Tutorial.1.2.4

This question involves the WordMatch class, which stores a secret string and provides methods that compare other strings to the secret string. You will write two methods in the WordMatch class. 

Write the WordMatch method scoreGuess. To determine the score to be returned, scoreGuess finds the number of times that guess occurs as a substring of secret and then multiplies that number by the square of the length of guess. Occurrences of guess may overlap within secret. 

Assume that the length of guess is less than or equal to the length of secret and that guess is not an empty string. 

The following examples show declarations of a WordMatch object. The tables show the outcomes of some possible calls to the scoreGuess method. 

WordMatch game = new WordMatch("mississippi");

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.4/assets/57818506/dc175aca-637f-44dd-bf12-77a0d1419369)


WordMatch game = new WordMatch("aaaabb");

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.4/assets/57818506/66b18a1f-4a5b-4ec1-b094-daef4ce412e4)


Write the WordMatch method findBetterGuess, which returns the better guess of its two String parameters, guess1 and guess2. If the scoreGuess method returns different values for guess1 and guess2, then the guess with the higher score is returned. If the scoreGuess method returns the same value for guess1 and guess2, then the alphabetically greater guess is returned. 

The following example shows a declaration of a WordMatch object and the outcomes of some possible calls to the scoreGuess and findBetterGuess methods.

WordMatch game = new WordMatch(“concatenation”);

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.4/assets/57818506/c4bd5523-e121-4ebb-8198-4ad5f2586aa9)


Write the complete WordMatch class, including the constructor and any required instance variables and methods. Your implementation must pass all of the tests in the WordMatchTest class (provided).


