package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.model.Result;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService search;
	
	@RequestMapping("/search")
	public JSONObject search(@RequestBody Article article){
		
		JSONObject requestMap = new JSONObject(); 
		
		//调用Service
		int i = search.search(article);
		requestMap.put("state", i);
		
		return requestMap;	
	}
}
