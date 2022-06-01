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


}
