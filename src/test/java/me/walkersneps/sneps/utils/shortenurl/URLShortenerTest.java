package me.walkersneps.sneps.utils.shortenurl;

/**
 * Created by Walkersneps on 11/06/16
 * in package me.walkersneps.sneps.utils.shortenurl
 * for SnepsUtils
 */


import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Walkersneps
 */
public class URLShortenerTest {

    private static final String LONGURL1 = "https://sneps.tk";
    private static final String LONGURL2 = "https://walkersneps.keybase.pub";

    private static URLShortener us;


    @Test
    public void testURLShortener () {
        summonObject();
        shrinkTest();
    }



    private void summonObject () {
        System.out.println("Testing class URLShortener {");
        System.out.println("Summoning a new URLShortener object...");
        us = new URLShortener();

        System.out.println("Done!");
    }


    private void shrinkTest () {
        System.out.println("Testing method 'shrink()'...");

        String shortenedURL = "ERROR!";

        try {
            shortenedURL = us.shrink(LONGURL1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("First shortened URL is --> " + shortenedURL);

        try {
            shortenedURL = us.shrink(LONGURL2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Second shortened URL is --> " + shortenedURL);

        System.out.println("Done!");
        System.out.println("} DONE!");
    }






} //end of class
