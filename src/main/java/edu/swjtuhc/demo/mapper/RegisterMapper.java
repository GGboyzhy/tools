package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.swjtuhc.demo.model.register;

public interface RegisterMapper extends JpaRepository<register,Integer>{
	public List<register> findByUsername(String username);
}
