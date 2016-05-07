package me.walkersneps.sneps.utils.property;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


import org.testng.annotations.Test;

import static me.walkersneps.sneps.utils.Constants.FILEPATH;
import static org.testng.Assert.assertEquals;

/**
 * @author Walkersneps
 */
public class PropertyWriterTest {

    private PropertyWriter pw = new PropertyWriter(FILEPATH);
    private PropertyReader pr = new PropertyReader(FILEPATH);

    @Test
    public void writePropertyTest () {
        System.out.println("Testing method 'writeProperty()' in class PropertyWriter.");

        String pKey = "writingTestKey";
        String pValue = "writingTestValue";

        pw.writeProperty(pKey, pValue);
        assertEquals(pr.readProperty(pKey), pValue);

        //hehe I'm tricking it :D
        pw.writeProperty(pValue, pKey);
        assertEquals(pr.readProperty(pValue), pKey);

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void getFILENAMETest () {
        System.out.println("Testing method 'getFILENAME()' in class PropertyWriter.");

        assertEquals(pw.getFILENAME(), FILEPATH);

        System.out.println("Done!");
        System.out.println();
    }

    @Test
    public void setFILENAMETest () {
        System.out.println("Testing method 'setFILENAME()' in class PropertyWriter.");

        String newFilename = "cheeky filename!";
        pw.setFILENAME(newFilename);
        assertEquals(pw.getFILENAME(), newFilename);
        pw.setFILENAME(FILEPATH);

        System.out.println("Done!");
        System.out.println();
    }




} //end of class
