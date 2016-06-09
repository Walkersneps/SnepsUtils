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
public class ByteArrayCheckTest {

    private static final byte[] ONLY_HAS_SAME_ELEMENT = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    private static final byte[] ONLY_HAS_SAME_ELEMENT_SHORT = {2, 2};
    private static final byte[] DIFFERENT_ELEMENTS = {1, 2, 3, 7, 9};
    private static final byte[] NULL_ARRAY = {};
    private static final byte[] ONE_ITEM_ARRAY = {7};

    @Test
    public void areAllSameElementTest () {
        System.out.println("Testing method 'areAllSame()' in class ByteArrayCheck.");

        Assert.assertTrue(ByteArrayCheck.areAllSame(ONLY_HAS_SAME_ELEMENT));
        Assert.assertTrue(ByteArrayCheck.areAllSame(ONLY_HAS_SAME_ELEMENT_SHORT));

        Assert.assertFalse(ByteArrayCheck.areAllSame(DIFFERENT_ELEMENTS));

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void areAllSameEdgeTest () {
        System.out.println("Testing edge cases in method 'areAllSame()' in class ByteArrayCheck.");

        // What if array only contains 1 item?
        Assert.assertTrue(ByteArrayCheck.areAllSame(ONE_ITEM_ARRAY));


        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void testByteArrayCheck () {
        System.out.println("Testing instance of class ByteArrayCheck.");

        ByteArrayCheck bac = new ByteArrayCheck();
        Assert.assertTrue(bac.hello());

        System.out.println("Done!");
        System.out.println();
    }


} //end of class
