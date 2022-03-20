package com.sample.lab2;

public class Account {
    private String title;
    private String username;
    private String password;
    private String url;
    private String notes;

    public Account (String aTitle, String aUsername, String aPassword, String aUrl, String aNotes){
        this.title = aTitle;
        this.username = aUsername;
        this.password = aPassword;
        this.url = aUrl;
        this.notes = aNotes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
