package me.walkersneps.sneps.utils.convert;

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
     * Always returns true
     * @return true
     */
    public boolean hello () {
        return true;
    }

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

    /**
     * Converts an integer in a byte type variable
     *
     * @param i the input integer
     *
     * @return resulting byte -- <font style="color:red">returns 0 if the input exceeds 8 bit size!</font>
     */
    public static byte intToByte (int i) {

        //check if we can do it
        if (i >= -128 && i <= 127) {
            return (byte)i;

        } else {
            return 0;
        }
    }

} //end of class