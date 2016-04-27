package me.walkersneps.sneps.utils.property;/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


import me.walkersneps.sneps.utils.convert.PrimitiveConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static me.walkersneps.sneps.utils.Constants.FILEPATH;
import static org.testng.Assert.assertEquals;

/**
 * @author Walkersneps
 */
public class PropertyReaderTest {

    private PropertyReader fr = new PropertyReader(FILEPATH);
    private PropertyWriter pw = new PropertyWriter(FILEPATH);

    @Test
    public void readPropertyTest () {
        String TEST1_SOLUTION_STRING = "hello";
        String TEST2_SOLUTION_STRING = "23";
        String TEST3_SOLUTION_STRING = "testing_some_stuff";
        int TEST2_SOLUTION_INT = 23;

        pw.writeProperty("test1", TEST1_SOLUTION_STRING);
        assertEquals(fr.readProperty("test1"), TEST1_SOLUTION_STRING);

        pw.writeProperty("test2", TEST2_SOLUTION_STRING);
        Assert.assertEquals(PrimitiveConverter.stringToInt(fr.readProperty("test2")), TEST2_SOLUTION_INT);

        pw.writeProperty("test3", TEST3_SOLUTION_STRING);
        assertEquals(fr.readProperty("test3"), TEST3_SOLUTION_STRING);
    }

    @Test
    public void getFILENAMETest () {
        assertEquals(fr.getFILENAME(), FILEPATH);
    }

    @Test
    public void setFILENAMETest () {
        String newFilename = "cheeky filename!";
        fr.setFILENAME(newFilename);
        assertEquals(fr.getFILENAME(), newFilename);
        fr.setFILENAME(FILEPATH);
    }


} //end of class