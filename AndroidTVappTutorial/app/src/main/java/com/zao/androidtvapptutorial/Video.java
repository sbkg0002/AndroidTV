package com.zao.androidtvapptutorial;

import java.util.Date;

public class Video {
    private int id;
    private String title;
    private Date dateAdded;
    private String description;
    private String filePath;
    private String thumbnail;
    
    public Video() {
        
    }
    
    public void SetId(int id) {
        this.id = id;
    }
    
    public int GetId() {
        return id;
    }
    
    public void SetTitle (String title) {
        this.Title
    }
    
    public String GetTitle() {
        return title;
    }
    
    public void SetDateAdded(Date date) {
        this.dateAdded = date;
    } 
    
    public Date GetDateAdded() {
        return dateAdded;
    }
    
    public void SetDescription(String description) {
        this.description = description;
    }
    
    public String GetDescription() {
        return description;
    }
    
    public void SetFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public String GetFilePath() {
        return filePath;
    }
    
    public void SetThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    
    public String GetThumbnail() {
        return thumbnail;
    }
}