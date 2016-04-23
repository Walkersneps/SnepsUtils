package me.walkersneps.sneps.utils.random;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


import me.walkersneps.sneps.utils.random.Randomizer;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Walkersneps
 */
public class RandomizerTest {

    @Test
    public void randomNumberTest () {

        //since it's random, we better test it several times to get the most different results as possible
        for (byte i = 0; i < 10; i++) {
            assertEquals(Randomizer.randomNumber(1), 0);
        }

        for (byte i = 0; i < 10; i++) {
            int r = Randomizer.randomNumber(4);
            assertTrue(r == 0 | r == 1 | r == 2 | r == 3);
        }

        for (byte i = 0; i < 10; i++) {
            int t = Randomizer.randomNumber(1);
            assertFalse(t > 0 | t < 0);
        }
    }


} //end of class
