package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.ArticleComment;

public interface ArticleCommentService {
    List<ArticleComment> getArticleCommentsByArticleId(int id);
    int addArticleComment(ArticleComment articleComment);
}

