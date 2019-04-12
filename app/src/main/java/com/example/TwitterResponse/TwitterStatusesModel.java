package com.example.TwitterResponse;

import java.io.Serializable;

public class TwitterStatusesModel implements Serializable {

    private   String created_at;
    private   String id;
    private   String id_str;
    private   String text;
    private   String truncated;
    private   String source;
    private   String retweet_count;
    private   String favorite_count;
    private   String favorited;
    private   String retweeted;
    private   String possibly_sensitive;
    private   TwitterUserModel user;


    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTruncated() {
        return truncated;
    }

    public void setTruncated(String truncated) {
        this.truncated = truncated;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(String retweet_count) {
        this.retweet_count = retweet_count;
    }

    public String getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(String favorite_count) {
        this.favorite_count = favorite_count;
    }

    public String getFavorited() {
        return favorited;
    }

    public void setFavorited(String favorited) {
        this.favorited = favorited;
    }

    public String getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(String retweeted) {
        this.retweeted = retweeted;
    }

    public String getPossibly_sensitive() {
        return possibly_sensitive;
    }

    public void setPossibly_sensitive(String possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    public TwitterUserModel getUser() {
        return user;
    }

    public void setUser(TwitterUserModel user) {
        this.user = user;
    }





}
