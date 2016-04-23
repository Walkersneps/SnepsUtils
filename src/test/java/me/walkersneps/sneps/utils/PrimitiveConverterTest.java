package me.walkersneps.sneps.utils;

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
        assertEquals(0, PrimitiveConverter.stringToInt("0"));
        assertEquals(23382, PrimitiveConverter.stringToInt("23382"));
        assertNotEquals(342, PrimitiveConverter.stringToInt("33"));
    }

    @Test
    public void stringToCharTest () {
        assertEquals('!', PrimitiveConverter.stringToChar("!"));
        assertEquals('2', PrimitiveConverter.stringToChar("2"));
        assertEquals('c', PrimitiveConverter.stringToChar("chocolate!"));
        assertEquals(FORWARDSLASH_CHARCODE, PrimitiveConverter.stringToChar("/"));
    }

    @Test
    public void charToStringTest () {
        assertEquals("!", PrimitiveConverter.charToString('!'));
        assertEquals("3", PrimitiveConverter.charToString('3'));
        assertEquals("(", PrimitiveConverter.charToString(OPEN_PARENTHESIS_CHARCODE));
        assertEquals("/", PrimitiveConverter.charToString(FORWARDSLASH_CHARCODE));
        assertEquals("A", PrimitiveConverter.charToString(CAPITAL_A_CHARCODE));
    }

    @Test
    public void intToStringTest () {
        assertEquals("0", PrimitiveConverter.intToString(0));
        assertEquals("134", PrimitiveConverter.intToString(134));
        assertEquals("233433", PrimitiveConverter.intToString(233433));
    }


} //end of class
