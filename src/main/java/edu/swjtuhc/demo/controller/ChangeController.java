package edu.swjtuhc.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.swjtuhc.demo.service.ChangeService;

public class ChangeController<Stu> {
	@Controller
	public class CommonController {
	    @Autowired
	    public ChangeService ChangeService;

	    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
	    public String login() {
	        return "/login/login";
	    }

	    //用户登陆
	    @RequestMapping(value = "/loginPage", method = {RequestMethod.POST, RequestMethod.GET})
	    public String login(HttpServletRequest request, HttpSession session) {
	        String tno = request.getParameter("tno");
	        String password = request.getParameter("password");
	        System.out.println("你输入的用户名为：" + tno);
	        System.out.println("你输入的密码为：" + password);
	        String tname =ChangeService.login(tno, password);
	        String  no=ChangeService.getsno(tno, password);
	        System.out.println("用户的工号为："+no);
	        session.setAttribute("no",no);

	        session.setAttribute("tname", tname);

	        if (tname == null) {
	            return "redirect:/";
	        } else {
	            return "redirect:/index";
	        }
	    }

	    //用户登陆成功主页面
	    @RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
	    public String loginindex(HttpSession session) {

	        return "/login/test";
	    }

	    //获取登陆用户信息
	    @RequestMapping(value = "/getteacherinfo1", method = {RequestMethod.POST})
	    @ResponseBody

//	    public String getUserInformation(HttpSession session,Model model) {
//	        String no12 = (String) session.getAttribute("no");
//	        //获取用户登陆成功绑定的学号，通过学号查询用户详细信息
//	        Stu stu=ChangeService.UserInformation(no12);
//
//	        System.out.println(stu.toString());
//	        String strings=stu.toString();
//	        return strings;
//	    }

	    //用户信息修改

	    public String saveTeacherInformation(HttpServletRequest request,HttpSession session) {

	        String sno=request.getParameter("sno");
	        String sname=request.getParameter("sname");
	        String password=request.getParameter("password");
	        String tno=request.getParameter("tno");
	        String tname=request.getParameter("tname");
	        String tgrade=request.getParameter("tgrade");

	        System.out.println("修改信息的姓名"+sname);
	        System.out.println("修改信息的密码"+password);
	        System.out.println("修改信息的课程号"+tno);
	        System.out.println("修改信息的课程名"+tname);
	        System.out.println("修改信息的成绩"+tgrade);

	        ChangeService.updateStu(sno,sname,password,tno,tname,tgrade);
	     //用户各个字段信息的更新  更新完直接返回该页面

	        return "/login/test";
	    }

	}

	}

