package me.walkersneps.sneps.utils;/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Walkersneps
 */
public class FileReaderTest {

    private final String FILEPATH = "./src/test/resources/propertyTest.properties";
    private final String TEST1_SOLUTION_STRING = "hello";
    private final int TEST2_SOLUTION_INT = 23;
    private final String TEST3_SOLUTION_STRING = "testing_some_stuff";

    private FileReader fr = new FileReader(FILEPATH);

    @Test
    public void readPropertyTest () {
        assertEquals(fr.readProperty("test1"), TEST1_SOLUTION_STRING);
        assertEquals(PrimitiveConverter.stringToInt(fr.readProperty("test2")), TEST2_SOLUTION_INT);
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
