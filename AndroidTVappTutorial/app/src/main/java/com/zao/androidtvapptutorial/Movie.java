package com.zao.androidtvapptutorial;

import android.util.Log;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *  Modified from AOSP sample source code, by corochann on 2/7/2015.
 *  Movie class represents video entity with title, description, image thumbs and video url.
 */
public class Movie {

    private static final String TAG = Movie.class.getSimpleName();

    static final long serialVersionUID = 727566175075960653L;
    private long id;
    private String title;
    private String studio;

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}