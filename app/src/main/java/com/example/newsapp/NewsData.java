package com.example.newsapp;

public class NewsData {

    private String mTitle;
    private String mSectionName;
    private String mWebURL;
    private String mDate;
    private String mAuthor;


    public NewsData(String title, String webUrl, String sectionName, String date, String author) {
        mWebURL = webUrl;
        mTitle = title;
        mSectionName = sectionName;
        mDate = date;
        mAuthor = author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebURL() {
        return mWebURL;
    }

    public String getDate() {
        return mDate;
    }

    public String getAuthor() {
        return mAuthor;
    }
}