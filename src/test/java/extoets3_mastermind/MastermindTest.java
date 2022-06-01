package extoets3_mastermind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MastermindTest {


    @Test
    public void testNewMastermind(){
        Mastermind mastermind = new Mastermind( 5 );
        assertEquals(5, mastermind.getArrOfStrings().length);
    }

    @Test
    public void testNewMastermindFilled(){
        Mastermind mastermind = new Mastermind( 7 );
        String[] arr = mastermind.getArrOfStrings();
        arr[0] = Mastermind.RED;
        arr[1] = Mastermind.GREEN;
        arr[2] = Mastermind.BLUE;
        arr[3] = Mastermind.ORANGE;
        arr[4] = Mastermind.BLACK;
        assertEquals(7, mastermind.getArrOfStrings().length);
        assertEquals("orange", arr[3]);
    }



}