package com.catolica;

import java.util.List;

public class Article {
    private String text;
    private Integer likes;
    private Blog blog;
    private List<Comment> comments;
    public Article(String text, Integer likes, Blog blog, List<Comment> comments) {
        this.text = text;
        this.likes = likes;
        this.blog = blog;
        this.comments = comments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Integer comments_quantity()
    {
        return 0;
    }
    public Integer words_quantity()
    {
        return 0;
    }
    public void like()
    {

    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
