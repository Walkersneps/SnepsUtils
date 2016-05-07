package me.walkersneps.sneps.utils.check.duplicate;

/**
 * Created by Walkersneps on 07/05/16
 * in package me.walkersneps.sneps.utils.check.duplicate
 * for SnepsUtils
 */


/**
 * @author Walkersneps
 */
public class ByteArrayCheck {


    /**
     * Check if an array of byte only contains the same element
     *
     * @param input the array to analyze
     * @return false if the input contains different elements, else true
     */
    public static boolean areAllSame(byte[] input) {

        //Cover the edge cases that the input array is null or has one element.
        if (input == null || input.length == 1)
            return true;

        int compare = input[0]; //Compare to the first element of the input array.

        //Check from the second element through the end of the input array.
        for (int i = 1; i < input.length; i++) {
            if (input[i] != compare) //if we find a difference:
                return false;
        }

        return true;

    }



} //end of class
