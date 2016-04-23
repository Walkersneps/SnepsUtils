package me.walkersneps.sneps.utils;

/**
 * Created by Walkersneps on 23/04/16
 * in package ${PACKAGE_NAME}
 * for SnepsUtils
 */


class PrimitiveConverter {

    static int stringToInt (String str){
        return Integer.parseInt(str); //return it
    }

    static char stringToChar (String str) {
        char character;
        character = str.charAt(0); //transform string in character

        return character; //return the obtained char
    }

    static String charToString (char c) {
        return Character.toString(c);
    }

    static String intToString (int i) {
        return Integer.toString(i);
    }

} //end of class
