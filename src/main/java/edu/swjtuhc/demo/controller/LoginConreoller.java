package edu.swjtuhc.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.register;

@RestController
public class LoginConreoller {
	 @RequestMapping(value="/login" ,method = RequestMethod.POST)
	    public register login(@RequestBody register user){
		 register test = new register("zmc","123");
	        return user;
	    }
}
