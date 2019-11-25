package edu.swjtuhc.demo.mapper;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.swjtuhc.demo.model.music;

public interface MusicDao extends JpaRepository<music, Long>{

}
