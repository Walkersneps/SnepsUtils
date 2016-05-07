package me.walkersneps.sneps.utils.convert;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


public class PrimitiveConverterTest {

    private static final char OPEN_PARENTHESIS_CHARCODE = 40;
    private static final char FORWARDSLASH_CHARCODE = 47;
    private static final char CAPITAL_A_CHARCODE = 65;

    private static final int BIG_NEGATIVE_INT = -200;
    private static final int BIG_POSITIVE_INT = 230;
    private static final int ADEQUATE_NEGATIVE_INT = -87;
    private static final int ADEQUATE_POSITIVE_INT = 103;
    private static final int BORDERLINE_SMALL_INT = -128;
    private static final int BORDERLINE_BIG_INT = 127;

    @Test
    public void stringToIntTest () {
        System.out.println("Testing method 'stringToInt()' in class PrimitiveConverter.");

        Assert.assertEquals(PrimitiveConverter.stringToInt("0"), 0);
        assertEquals(PrimitiveConverter.stringToInt("23382"), 23382);
        assertNotEquals(PrimitiveConverter.stringToInt("33"), 342);

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void stringToCharTest () {
        System.out.println("Testing method 'stringToChar()' in class PrimitiveConverter.");

        assertEquals(PrimitiveConverter.stringToChar("!"), '!');
        assertEquals(PrimitiveConverter.stringToChar("2"), '2');
        assertEquals(PrimitiveConverter.stringToChar("chocolate!"), 'c');
        assertEquals(PrimitiveConverter.stringToChar("/"), FORWARDSLASH_CHARCODE);

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void charToStringTest () {
        System.out.println("Testing method 'charToString()' in class PrimitiveConverter.");

        assertEquals(PrimitiveConverter.charToString('!'), "!");
        assertEquals(PrimitiveConverter.charToString('3'), "3");
        assertEquals(PrimitiveConverter.charToString(OPEN_PARENTHESIS_CHARCODE), "(");
        assertEquals(PrimitiveConverter.charToString(FORWARDSLASH_CHARCODE), "/");
        assertEquals(PrimitiveConverter.charToString(CAPITAL_A_CHARCODE), "A");

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void intToStringTest () {
        System.out.println("Testing method 'intToString()' in class PrimitiveConverter.");

        assertEquals(PrimitiveConverter.intToString(0), "0");
        assertEquals(PrimitiveConverter.intToString(134), "134");
        assertEquals(PrimitiveConverter.intToString(233433), "233433");

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void intToByteTest () {
        System.out.println("Testing method 'intToByte()' in class PrimitiveConverter.");

        assertEquals(PrimitiveConverter.intToByte(BIG_NEGATIVE_INT), 0);
        assertEquals(PrimitiveConverter.intToByte(BIG_POSITIVE_INT), 0);

        assertEquals(PrimitiveConverter.intToByte(ADEQUATE_NEGATIVE_INT), -87);
        assertEquals(PrimitiveConverter.intToByte(ADEQUATE_POSITIVE_INT), 103);
        assertEquals(PrimitiveConverter.intToByte(BORDERLINE_BIG_INT), 127);
        assertEquals(PrimitiveConverter.intToByte(BORDERLINE_SMALL_INT), -128);

        System.out.println("Done!");
        System.out.println();
    }











} //end of class
