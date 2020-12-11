package com.medico.medico.article.service;

import com.medico.medico.article.model.Article;
import com.medico.medico.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticles() {
        List<Article>  articles = new ArrayList<>();
        articleRepository.findAll().forEach(articles::add);
        return articles;
    }

    @Override
    public Article getArticleWithId(Integer Id) {
        return articleRepository.findById(Id).orElse(null);
    }

    @Override
    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void updateArticle(Integer articleId, Article article) {
        articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Integer articleId) {
        articleRepository.deleteById(articleId);
    }
}
