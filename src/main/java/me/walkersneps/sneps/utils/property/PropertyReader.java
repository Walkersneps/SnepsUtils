package me.walkersneps.sneps.utils.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */

/**
 * @author Walkersneps
 */
public class PropertyReader {

    private String FILENAME;

    // Constructor
    /**
     * @param filename string containing name (or path) of the file we want to access
     */
    public PropertyReader (String filename) {
        FILENAME = filename;
    }


    /**
     * Reads the value of a property in a property file
     *
     * @param key string containing the key we want to access
     *
     * @return the value of given key
     */
    public String readProperty (String key) {

        String value = null;

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream(FILENAME); //prepare the file to read

            prop.load(input); // load the properties file

            value = prop.getProperty(key); // get the property value

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close(); //close the input stream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return value; //return the read value
    }

    //getter
    /**
     * Getter for FILENAME variable
     *
     * @return actual file name (or path)
     */
    public String getFILENAME () {
        return FILENAME;
    }

    //setter
    /**
     * Sets a new file name (or path)
     *
     * @param filename string containing name (or path) of the file we want to access
     */
    public void setFILENAME (String filename) {
        FILENAME = filename;
    }


} //end of class
