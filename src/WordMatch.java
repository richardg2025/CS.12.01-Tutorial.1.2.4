public class WordMatch {
    String secretWord;
    public WordMatch(String secretWord){
        this.secretWord = secretWord;
    }

    public int scoreGuess(String input){
        if(input.length() > secretWord.length()) throw new IllegalArgumentException("Your guess cannot exceed the number of characters in the Secret word");
        else if(input.length() == 0) throw new IllegalArgumentException("Your guess cannot be an empty String!");
        int temp = 0;
        System.out.println("length is:" + input.length());
        System.out.println("****************************************************");
        for(int i = 0; i < secretWord.length();i++){
            System.out.println("input: " + input);
            if(i + input.length() > secretWord.length()) break;
            else if(secretWord.substring(i,i+input.length()).equals(input)) {
                temp++;
                System.out.println("temp added 1");
            }
        }
        return temp * input.length() * input.length();
    }

    public String findBetterGuess(String input1, String input2){
        if(scoreGuess(input1) > scoreGuess(input2)){
            return input1;
        }
        else if(scoreGuess(input1) < scoreGuess(input2)){
            return input2;
        }
        else if(scoreGuess(input1) == scoreGuess(input2)){
            if(input1.compareTo(input2) > 0){
                return input1;
            }
            else if(input1.compareTo(input2) < 0){
                return input2;
            }
        }
        return null;
    }
}