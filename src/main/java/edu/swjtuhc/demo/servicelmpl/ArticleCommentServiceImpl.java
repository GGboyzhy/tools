package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ArticleCommentMapper;
import edu.swjtuhc.demo.model.ArticleComment;
import edu.swjtuhc.demo.service.ArticleCommentService;

@Service
public class ArticleCommentServiceImpl implements ArticleCommentService {
    
	@Autowired
    private ArticleCommentMapper articleCommentMapper;
    
	@Override
    public List<ArticleComment> getArticleCommentsByArticleId(int id) {
        return articleCommentMapper.getArticleCommentsByArticleId(id);
    }

    @Override
    public int addArticleComment(ArticleComment articleComment) {
        return articleCommentMapper.addArticleComment(articleComment);
    }

}

