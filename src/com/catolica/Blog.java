package com.catolica;

import java.util.List;

public class Blog extends WebSite{
    private List<Article> articles;
    public Blog(String url, String name, List<Article> articles) {
        super(url, name);
        this.articles = articles;
    }
    public void articles_quantity()
    {}
    public Integer comments_quantity()
    {
        return 0;
    }
    public Integer likes_quantity()
    {
        return 0;
    }
    public Integer words_quantity()
    {
        return 0;
    }
    public void show_articles()
    {

    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
