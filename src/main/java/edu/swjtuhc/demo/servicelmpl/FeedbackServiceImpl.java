package edu.swjtuhc.demo.servicelmpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.FeedbackMapper;
import edu.swjtuhc.demo.model.Advise;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	FeedbackMapper feedbackmapper;

	@Override
	public int feedback(Advise advise) {
		// TODO Auto-generated method stub
					
			Date now = new Date();
			advise.setFeedback_time(now);
			int i = feedbackmapper.insertAdvise(advise);
			return i;
	}
}
