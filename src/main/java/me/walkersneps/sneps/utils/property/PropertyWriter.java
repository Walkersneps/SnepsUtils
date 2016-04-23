package me.walkersneps.sneps.utils.property;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils
 * for SnepsUtils
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author Walkersneps
 */
public class PropertyWriter {

    private String FILENAME;

    // Constructor
    /**
     * @param filename string containing name (or path) of the file we want to access
     */
    public PropertyWriter (String filename) {
        FILENAME = filename;
    }


    /**
     * Writes a new property
     *
     * @param key key for the value we want to (over)write
     *
     * @param value value for the chosen key
     */
    public void writeProperty (String key, String value) {

        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream(FILENAME); // prepare the file to write

            prop.setProperty(key, value); // set the properties value

            prop.store(output, null); // save properties to project root folder

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close(); //close the outputStream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
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
