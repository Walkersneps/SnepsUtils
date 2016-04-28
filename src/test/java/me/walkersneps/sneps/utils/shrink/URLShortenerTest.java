package me.walkersneps.sneps.utils.shrink;

/**
 * Created by Walkersneps on 28/04/16
 * in package me.walkersneps.sneps.utils.shrink
 * for SnepsUtils
 */


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Walkersneps
 */
public class URLShortenerTest {

    URLShortener us = new URLShortener("Hello");

    @Test
    public void set_get_accessTokenTest () {
        assertEquals(us.getAccessToken(), "Hello");
        us.setAccessToken("hi");
        assertEquals(us.getAccessToken(), "hi");
    }

    @Test
    public void set_get_longURLTest () {
        us.setLongURL("hello.com");
        assertEquals(us.getLongURL(), "hello.com");
        us.setLongURL("cya.all.it");
        assertEquals(us.getLongURL(), "cya.all.it");
    }


} //end of class
