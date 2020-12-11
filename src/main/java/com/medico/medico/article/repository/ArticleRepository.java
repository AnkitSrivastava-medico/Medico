package com.medico.medico.article.repository;

import com.medico.medico.article.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
