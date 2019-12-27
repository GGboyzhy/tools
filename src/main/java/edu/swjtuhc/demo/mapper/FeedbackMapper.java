package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Advise;
import edu.swjtuhc.demo.model.Article;

@Mapper
public interface FeedbackMapper {
	int insertAdvise(Advise advise);
}
