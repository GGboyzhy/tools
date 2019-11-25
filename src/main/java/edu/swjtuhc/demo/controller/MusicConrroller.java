package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.music;
import edu.swjtuhc.demo.service.MusicService;

@RestController
public class MusicConrroller {
	@Autowired
    MusicService musicService=new MusicService();
	
	@RequestMapping("/musicFindAll")
	public List<music> musicFindAll(){

        return musicService.findAll();
    }
}
