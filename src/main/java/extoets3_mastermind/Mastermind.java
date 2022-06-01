package extoets3_mastermind;

public class Mastermind {
    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";
    public static final String ORANGE = "orange";
    public static final String BLACK = "black";
    public static final String WHITE = "white";

    public static final int RESULT_BAD = 0;
    public static final int RESULT_ALMOST = 1;
    public static final int RESULT_OK = 2;

    private final String[] arrOfStrings;

    public Mastermind(String[] stringArray) {
        this.arrOfStrings = stringArray;
    }

    public String[] getArrOfStrings() {
        return arrOfStrings;
    }

    public int[] processGuess(String[] guessArray){
        if(guessArray.length == 0 || this.arrOfStrings.length == 0 || (guessArray.length != this.arrOfStrings.length)) return null;
        int[] result = new int[arrOfStrings.length];
        for(int i = 0; i < guessArray.length; i++){
            String guess = guessArray[i];
            for(int j = 0; j < this.arrOfStrings.length; j++ ){
                String answer = this.arrOfStrings[j];
                if(guess.equals(answer) && i == j) {
                    result[i] = Mastermind.RESULT_OK;
                    break;
                }
                else if(guess.equals(answer)) {
                    result[i] = Mastermind.RESULT_ALMOST;
                    break;
                }
                else result[i] = Mastermind.RESULT_BAD;
                }
            }
        return result;
        }

}


