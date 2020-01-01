package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.ArticleComment;

@Mapper
public interface ArticleCommentMapper {
    List<ArticleComment> getArticleCommentsByArticleId(int id);
    int addArticleComment(ArticleComment articleComment);
}
