package com.medico.medico.article.service;

import com.medico.medico.article.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles();

    Article getArticleWithId(Integer Id);

    void addArticle(Article article);

    void updateArticle(Integer articleId, Article article);

    void deleteArticle(Integer articleId);
}
