package edu.swjtuhc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ChangeMapper.change;

	@Service
	public class ChangeService {
	   
	    public change ChangeMapper;
	    @Autowired
	    public String getsno(String sno,String password){
	        return ChangeMapper.getsno(sno, password);
	    }

	    public String login(String sno, String password){
	        return ChangeMapper.login(sno, password);
	    }
//
//	    public  Stu UserInformation(String sno){
//	        return ChangeMapper.UserInformation(sno);
//	    }

	    public void updateStu(String sno,String sname,String password,String tno,String tname,String tgrade){
	        ChangeMapper.updateStu(sno, sname, password, tno, tname, tgrade);
	    }

		
}
