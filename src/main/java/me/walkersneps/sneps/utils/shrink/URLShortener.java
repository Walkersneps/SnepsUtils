package me.walkersneps.sneps.utils.shrink;

/**
 * Created by Walkersneps on 28/04/16
 * in package me.walkersneps.sneps.utils.shrink
 * for SnepsUtils
 */


import net.swisstech.bitly.BitlyClient;
import net.swisstech.bitly.model.Response;

/**
 * @author Walkersneps
 */
public class URLShortener {

    private String accessToken;
    private String longURL;
    private String shortenedURL;
    private BitlyClient client;

    /**
     * Constructor for URLShortener object
     *
     * @param accessToken the bitly API access token
     */
    public URLShortener (String accessToken) {
        this.accessToken = accessToken;
        this.client = new BitlyClient(accessToken);
    }

    /**
     * Performs the shrinking operation and saves shrunk URL in variable (<font style="color:red">shortenedURL</font>)
     * Get it via
     * @see URLShortener#getShortenedURL()
     */
    public void shrink () {
        Response respShort = client.shorten().setLongUrl(longURL).call();
        shortenedURL = respShort.toString();
    }

    /**
     * Faster alternative to
     * @see URLShortener#shrink()
     *
     * @param longURL the URL to shorten
     *
     * @return the shortened URL
     */
    public String fastShrink (String longURL) {
        setLongURL(longURL);
        shrink();
        return getShortenedURL();
    }


    //setters
    /**
     * Sets the bitly client's access token
     * But it doesn't update it!
     *
     * @param accessToken the new access Token
     */
    public void setAccessToken (String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Sets the URL that will be shortened
     *
     * @param longURL the URL to shorten
     */
    public void setLongURL (String longURL) {
        this.longURL = longURL;
    }


    //getters
    /**
     * @return bitly client's access token
     */
    public String getAccessToken () {
        return accessToken;
    }

    /**
     * @return the url that will be shortened
     */
    public String getLongURL () {
        return longURL;
    }

    /**
     * @return the shrunk URL
     */
    public String getShortenedURL () {
        return shortenedURL;
    }



} //end of class
