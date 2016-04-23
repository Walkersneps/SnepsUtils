package me.walkersneps.sneps.utils.property;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


import me.walkersneps.sneps.utils.property.PropertyReader;
import me.walkersneps.sneps.utils.property.PropertyWriter;
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
        String pKey = "writingTestKey";
        String pValue = "writingTestValue";

        pw.writeProperty(pKey, pValue);
        assertEquals(pr.readProperty(pKey), pValue);

        //hehe I'm tricking it :D
        pw.writeProperty(pValue, pKey);
        assertEquals(pr.readProperty(pValue), pKey);
    }

    @Test
    public void getFILENAMETest () {
        assertEquals(pw.getFILENAME(), FILEPATH);
    }

    @Test
    public void setFILENAMETest () {
        String newFilename = "cheeky filename!";
        pw.setFILENAME(newFilename);
        assertEquals(pw.getFILENAME(), newFilename);
        pw.setFILENAME(FILEPATH);
    }




} //end of class
