package edu.swjtuhc.demo.servicelmpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.swjtuhc.demo.mapper.SearchMapper;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.SearchService;

public class SearchServiceImpl implements SearchService{
	@Autowired
	SearchMapper search;
	
	@Override
	public int search(Article article) {
		// TODO Auto-generated method stub
	
	//调用Mapper实现发布
	Article a = SearchMapper.selectArticleByTitle(article.getTitle());
	
	int i = -1;
	if (a==null) {
		
		
	}else {
		i = 0; //文章不能重名
	}
		return i;
	}
}
