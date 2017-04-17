package com.learn.ssh.control;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.ssh.entity.User;
import com.learn.ssh.service.UserService;

@Controller
@RequestMapping("/{A}")
public class UserControllor {
	
	public UserControllor(){
		System.out.println("UserControllor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>init");
	}
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/hello/{B}", method = RequestMethod.GET)
	public void addUser(@PathVariable("A") String aName,@PathVariable("B") String bName){
		User user = new User();
		user.setCreateDate(new Date());
		user.setUserName(bName);
		String userId = userService.saveUser(user);
		System.out.println(aName+"userId:"+userId);
	}
	
}
