package me.walkersneps.sneps.utils.random;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


import java.util.Random;

/**
 * @author Walkersneps
 */
public class Randomizer {

    /**
     * Returns a random number in range between 0 and parameter 'exclusiveMax'.  0 included, parameter excluded
     *
     * @param exclusiveMax exclusive maximum number
     *
     * @return random number 'x' where 0 less or equals x less than exclusiveMax
     */
    public static int randomNumber(int exclusiveMax) {
        Random rand = new Random();
        return rand.nextInt(exclusiveMax);
    }


    /**
     * Always returns true
     * @return true
     */
    public boolean hello () {
        return true;
    }


} //end of class
