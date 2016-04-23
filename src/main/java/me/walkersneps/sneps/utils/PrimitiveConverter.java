package me.walkersneps.sneps.utils;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */

/**
 * @author Walkersneps
 */
public class PrimitiveConverter {

    /**
     * Converts a string to an int type variable
     *
     * @param str the input string
     *
     * @return first integer found in the input string
     */
    public static int stringToInt (String str){
        return Integer.parseInt(str);
    }

    /**
     * Converts a string to a char type variable
     *
     * @param str the input string
     *
     * @return first character in the input string
     */
    public static char stringToChar (String str) {
        return str.charAt(0);
    }

    /**
     * Converts a char to a string type variable
     *
     * @param c the input character
     *
     * @return string containing the passed character
     */
    public static String charToString (char c) {
        return Character.toString(c);
    }

    /**
     * Converts an integer in a string type variable
     *
     * @param i the input integer
     *
     * @return string containing the passed integer
     */
    public static String intToString (int i) {
        return Integer.toString(i);
    }

} //end of class
