package extoets3_mastermind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MastermindTest {


    @Test
    public void testNewMastermind(){
        Mastermind mastermind = new Mastermind( 5 );
        assertEquals(5, mastermind.getArrOfStrings().length);
    }
}