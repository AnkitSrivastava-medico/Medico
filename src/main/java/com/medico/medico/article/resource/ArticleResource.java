package com.medico.medico.article.resource;

import com.medico.medico.article.model.Article;
import com.medico.medico.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleResource {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @RequestMapping("/articles/{id}")
    public Article getArticleWithId(@PathVariable Integer Id) {
        return articleService.getArticleWithId(Id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/articles")
    public void enterNewArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/articles/{id}")
    public void updateArticle(@RequestBody Article article, @PathVariable Integer Id) {
        articleService.updateArticle(Id, article);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/articles")
    public void deleteArticle(@PathVariable Integer Id) {
        articleService.deleteArticle(Id);
    }
}
