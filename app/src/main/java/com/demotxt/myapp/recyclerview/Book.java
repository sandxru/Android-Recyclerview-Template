package com.demotxt.myapp.recyclerview;

/**
 * Created by Sandaru Muthuwadige on 11/05/2019.
 */

public class Book {

    private String Title;
    private String Description ;
    private int Thumbnail ;

    public Book() {
    }

    public Book(String title,  String description, int thumbnail) {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Title;
    }


    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
