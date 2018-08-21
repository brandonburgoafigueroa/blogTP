package com.catolica;

public class Comment {
    private String text;
    private String likes;
    private Article article;
    public Comment(String text, String likes, Article article) {
        this.text = text;
        this.likes = likes;
        this.article = article;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
    public Integer words_quantity()
    {
        return 0;
    }
    public void like()
    {

    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
