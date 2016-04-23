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

    @Test
    public void stringToIntTest () {
        Assert.assertEquals(PrimitiveConverter.stringToInt("0"), 0);
        assertEquals(PrimitiveConverter.stringToInt("23382"), 23382);
        assertNotEquals(PrimitiveConverter.stringToInt("33"), 342);
    }

    @Test
    public void stringToCharTest () {
        assertEquals(PrimitiveConverter.stringToChar("!"), '!');
        assertEquals(PrimitiveConverter.stringToChar("2"), '2');
        assertEquals(PrimitiveConverter.stringToChar("chocolate!"), 'c');
        assertEquals(PrimitiveConverter.stringToChar("/"), FORWARDSLASH_CHARCODE);
    }

    @Test
    public void charToStringTest () {
        assertEquals(PrimitiveConverter.charToString('!'), "!");
        assertEquals(PrimitiveConverter.charToString('3'), "3");
        assertEquals(PrimitiveConverter.charToString(OPEN_PARENTHESIS_CHARCODE), "(");
        assertEquals(PrimitiveConverter.charToString(FORWARDSLASH_CHARCODE), "/");
        assertEquals(PrimitiveConverter.charToString(CAPITAL_A_CHARCODE), "A");
    }

    @Test
    public void intToStringTest () {
        assertEquals(PrimitiveConverter.intToString(0), "0");
        assertEquals(PrimitiveConverter.intToString(134), "134");
        assertEquals(PrimitiveConverter.intToString(233433), "233433");
    }


} //end of class
