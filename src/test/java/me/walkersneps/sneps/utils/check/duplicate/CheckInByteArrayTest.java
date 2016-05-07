package me.walkersneps.sneps.utils.check.duplicate;

/**
 * Created by Walkersneps on 07/05/16
 * in package me.walkersneps.sneps.utils.check.duplicate
 * for SnepsUtils
 */


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Walkersneps
 */
public class CheckInByteArrayTest {

    private static final byte[] ONLY_HAS_SAME_ELEMENT = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    private static final byte[] ONLY_HAS_SAME_ELEMENT_SHORT = {2, 2};
    private static final byte[] DIFFERENT_ELEMENTS = {1, 2, 3, 7, 9};

    @Test
    public void areAllSameElementTest () {
        System.out.println("Testing method 'areAllSame()' in class ByteArrayCheck.");

        Assert.assertTrue(ByteArrayCheck.areAllSame(ONLY_HAS_SAME_ELEMENT));
        Assert.assertTrue(ByteArrayCheck.areAllSame(ONLY_HAS_SAME_ELEMENT_SHORT));

        Assert.assertFalse(ByteArrayCheck.areAllSame(DIFFERENT_ELEMENTS));

        System.out.println("Done!");
        System.out.println();
    }


} //end of class
