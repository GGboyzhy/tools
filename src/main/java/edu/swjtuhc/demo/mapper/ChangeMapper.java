package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

public class ChangeMapper {
	@Component
	public interface change<Stu> {

	    //登陆成功后查询用户的学号
	    @Select("select sno from stu where sno=#{sno} and password=#{password}")
	    public String getsno(@Param("sno") String sno,@Param("password") String password);

	    //登陆成功后查询用户的姓名
	    @Select("select sname from stu where sno=#{sno} and password=#{password}")
	    public String login(@Param("sno") String sno,@Param("password") String password);

	    //登陆成功后查询用户的所有信息
	    @Select("select * from stu where sno=#{sno}")
	   public Stu UserInformation(@Param("sno") String sno);

	    //用户信息的更新操作
	    @Update("update stu set sname=#{sname},password=#{password},tno=#{tno},tname=#{tname},tgrade=#{tgrade} where sno=#{sno}")
	    public void updateStu(@Param("sno") String sno,@Param("sname") String sname,@Param("password") String password,@Param("tno") String tno,@Param("tname") String tname,@Param("tgrade") String tgrade);

	}
	
}
