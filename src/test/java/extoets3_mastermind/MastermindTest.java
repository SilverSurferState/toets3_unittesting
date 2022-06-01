package extoets3_mastermind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MastermindTest {


    @Test
    public void testNewMastermind(){
        String[] arr = new String[5];
        Mastermind mastermind = new Mastermind( arr );
        assertEquals(5, mastermind.getArrOfStrings().length);
    }

    @Test
    public void testNewMastermindFilled(){
        String[] arr = {Mastermind.RED, Mastermind.BLUE, Mastermind.GREEN, Mastermind.ORANGE, Mastermind.WHITE, Mastermind.BLUE, Mastermind.GREEN};
        Mastermind mastermind = new Mastermind(arr);
        assertEquals(7, mastermind.getArrOfStrings().length);
        assertEquals("orange", arr[3]);
    }

    @Test
    public void testProcessGuess(){
        String[] arr = {Mastermind.RED, Mastermind.BLUE, Mastermind.GREEN, Mastermind.ORANGE, Mastermind.WHITE};
        Mastermind mastermind = new Mastermind(arr);
        String[] guess = {Mastermind.RED, Mastermind.GREEN, Mastermind.BLUE, Mastermind.ORANGE, Mastermind.WHITE};
        assertArrayEquals(new int[]{2, 1, 1, 2, 2}, mastermind.processGuess(guess));
    }

    @Test
    public void testProcessGuessWithZeroGuess(){
        String[] arr = {Mastermind.RED, Mastermind.BLUE, Mastermind.GREEN, Mastermind.ORANGE, Mastermind.WHITE};
        Mastermind mastermind = new Mastermind(arr);
        String[] guess = new String[0] ;
        assertArrayEquals(null, mastermind.processGuess(guess));
    }

}