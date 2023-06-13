package edu.qc.seclass;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void setNullCurrentString() {
        mycustomstring.setString(null);
        assertNull(mycustomstring.getString());
    }
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }


    //test if no digit in string
    @Test
    public void testCountNumbers2() {

        mycustomstring.setString("kamal");
        Assert.assertEquals(0, mycustomstring.countNumbers());
    }



    //test  if String is null
    @Test(expected = NullPointerException.class)
    public void testCountNumbers3() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }


    //checks  when string is at the end
    @Test
    public void testCountNumbers4() {

        mycustomstring.setString("kamal1");
        Assert.assertEquals(1, mycustomstring.countNumbers());
    }

    @Test
    //test method when string is empty
    public void testCountNumbers5() {
        mycustomstring.setString("");
        Assert.assertEquals(0, mycustomstring.countNumbers());
    }



    //test if strings is presented at last
    @Test
    public void testCountNumbers6() {

        mycustomstring.setString("My roll no. is 10678");
        Assert.assertEquals(1, mycustomstring.countNumbers());
    }



    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }



    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() { //testing the index of the characters

        mycustomstring.setString(" the hash table has a value of H7hk4fs");
        assertEquals("hhhaeaaaef74", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }



    @Test //checks every nth character length exceeds the n
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString("hello");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(6, false));
    }



    // length test if less than n
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {

        mycustomstring.setString("ka");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }



    @Test //test for a string of characters of position
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString("I am transferred student from LAGCC");
        assertEquals("aeem", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(7, true));

    }



    //testing for NullpointerException
    @Test  (expected=NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false);  //n is greater then 0

    }


    @Test   // returns a string of characters of position
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.setString("I live in Queens ");
        assertEquals("I live in Queens", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    //checks if there's NullPointerException condition
    @Test  (expected=NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString(null);  //string is null
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true);

    }


    @Test  //returns a string of characters
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.setString(" I love America ");
        assertEquals("I love America ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }


    @Test //test a string of characters of position
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("I am Computer Science Major at Queens Collge");
        assertEquals("mcaQo", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, false));

    }



    @Test //test for a string of characters of position
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("This is my 3rd assignment ");
        assertEquals("i i", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, true));

    }


    @Test //testing for a string of characters of position
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("I love playing Guitar");
        assertEquals("pG", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, false));
    }

    @Test //testing to return a string of characters of position
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString(" This is February ");
        assertEquals("he", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, true));

    }


    @Test
    public void testConvertDigitsToNamesInSubstring1() { //// testing for converting digit to name
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }


    @Test(expected=IllegalArgumentException.class) // testing for IllegalArgumentException
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("I am looking for an internship");
        mycustomstring.convertDigitsToNamesInSubstring(4, 3);
    }


    @Test(expected = NullPointerException.class) // testing for NullPointerException
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
    }


    @Test(expected = IllegalArgumentException.class) // test IllegalArgumentException
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.convertDigitsToNamesInSubstring(23, 17);
    }

    @Test(expected = MyIndexOutOfBoundsException.class) // testing for MyIndexOutOfBoundsException
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.convertDigitsToNamesInSubstring(0, 3);
    }



    @Test
    public void testConvertDigitsToNamesInSubstring6() { //testing if start Position and end Position falls between 5 and 20
        mycustomstring.setString("In 40, I will be old");
        mycustomstring.convertDigitsToNamesInSubstring(5,20 );
        assertEquals("In 4Zero, I will be old", mycustomstring.getString());
    }
    @Test
    public void testConvertDigitsToNamesInSubstring7() { //test for Converting Digits To Names In Substring
        mycustomstring.setString("I will graduate at 27 and my goal is to be an Engineer at 30");
        mycustomstring.convertDigitsToNamesInSubstring(1,60);
        assertEquals("I will graduate at TwoSeven and my goal is to be an Engineer at ThreeZero", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {  //testing if starting position and end Position matches
        mycustomstring.setString("I joined Queens college at 21 and I will grauduate at 23");
        mycustomstring.convertDigitsToNamesInSubstring(28,28);
        assertEquals("I joined Queens college at Two1 and I will grauduate at 23", mycustomstring.getString());

    }

}
