package me.walkersneps.sneps.utils.lazy;

/**
 * Created by Walkersneps on 09/06/16
 * in package me.walkersneps.sneps.utils.lazy
 * for SnepsUtils
 */


import org.testng.annotations.Test;

/**
 * @author Walkersneps
 */
public class AliasesTest {

    /*private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private static final String STRING_A = "Hi, this is STRING_A";
    private static final String STRING_B = "Bye, this is STRING_B";
    private static final String EMPTY_STRING = "";
    private static final String SPACE_STRING = " ";


    @BeforeMethod
    public void setUpStreams () {
        System.out.println("Setting up output streams...");
        System.setOut(new PrintStream(outContent));
        System.setOut(new PrintStream(errContent));
        System.out.println("Done.");
    }

    @AfterMethod
    public void cleanUpStreams () {
        System.out.println("Cleaning up output streams...");
        System.setOut(null);
        System.setErr(null);
        System.out.println("Done.");
        System.out.println();
    } */

    @Test
    public void testAliases () {
        System.out.println("Testing class Aliases.");

        Aliases a = new Aliases();

        /*a.p(STRING_A);
        assertEquals(outContent.toString(), STRING_A);*/


        System.out.println("Done!");
    }



} //end of class
