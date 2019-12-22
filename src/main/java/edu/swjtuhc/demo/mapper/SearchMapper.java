package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Article;

@Mapper
public interface SearchMapper {
	public static Article selectArticleByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
}
