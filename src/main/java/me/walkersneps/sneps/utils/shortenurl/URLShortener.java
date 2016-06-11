package me.walkersneps.sneps.utils.shortenurl;

/**
 * Created by Walkersneps on 11/06/16
 * in package me.walkersneps.sneps.utils.shortenurl
 * for SnepsUtils
 */


import com.google.api.client.extensions.appengine.http.UrlFetchTransport;
import com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.urlshortener.Urlshortener;
import com.google.api.services.urlshortener.UrlshortenerScopes;
import com.google.api.services.urlshortener.model.Url;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Walkersneps
 */
public class URLShortener {

    private static Urlshortener newUrlshortener () {
        AppIdentityCredential credential = new AppIdentityCredential(Arrays.asList(UrlshortenerScopes.URLSHORTENER));
        return new Urlshortener.Builder(new UrlFetchTransport(), new JacksonFactory(), credential).build();
    }




    protected String shrink (String longUrl) throws IOException {

        Urlshortener shortener = newUrlshortener();

        Url toInsert = new Url().setLongUrl(longUrl);

        try {
            shortener.url().insert(toInsert).execute();

        } catch (GoogleJsonResponseException e) {
            System.out.println("Got a GGoogleJsonResponse Exception while trying to shrink an URL! Follows stack trace:");
            e.printStackTrace();
        }

        return shortener.url().toString();


    }






} //end of class
