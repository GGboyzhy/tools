package edu.swjtuhc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.MusicDao;
import edu.swjtuhc.demo.model.music;

@Service
public class MusicService {
	@Autowired

    MusicDao musicDao;
	public List<music> findAll(){

        return musicDao.findAll();

    }
}
