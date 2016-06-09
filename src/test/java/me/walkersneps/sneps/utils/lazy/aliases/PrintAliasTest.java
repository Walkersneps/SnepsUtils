package me.walkersneps.sneps.utils.lazy.aliases;

/**
 * Created by Walkersneps on 09/06/16
 * in package me.walkersneps.sneps.utils.lazy.aliases
 * for SnepsUtils
 */


import org.testng.annotations.Test;

/**
 * @author Walkersneps
 */
public class PrintAliasTest {

    private static String TEST_TEXT = "It works?!";

    @Test
    public void testPrintAlias () {
        System.out.println("Testing class PrintAlias.");

        PrintAlias pa = new PrintAlias();
    }

    @Test
    public void ePrintTest () {
        PrintAlias.eprint(TEST_TEXT);

        System.out.println("Done!");
        System.out.println();
    }




} //end of class
