package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import edu.swjtuhc.demo.model.Advise;
import edu.swjtuhc.demo.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping(value="/feedback")
    public JSONObject upload(@RequestBody Advise advise){
		
		JSONObject requestMap = new JSONObject(); 
		
		//调用Service
		int i = feedbackService.feedback(advise);
		requestMap.put("state", i);	
		return requestMap;	
	}
}
