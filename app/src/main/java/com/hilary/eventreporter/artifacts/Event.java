package com.hilary.eventreporter.artifacts;

/**
 * Created by huachuanwang on 9/3/17.
 */

public class Event {
    private int good;
    private int bad;
    private int commendNumber;
    private String id;
    private String location;
    private long time;
    private String username;
    private String description;
    private int repost;
    private String title;

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String imgUri;
    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }


    public Event() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCommendNumber() {
        return commendNumber;
    }

    public void setCommendNumber(int commendNumber) {
        this.commendNumber = commendNumber;
    }

}
