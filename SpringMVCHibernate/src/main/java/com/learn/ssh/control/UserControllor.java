package com.learn.ssh.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.ssh.entity.User;
import com.learn.ssh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControllor {
	
	public UserControllor(){
		System.out.println("UserControllor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>init");
	}
	
	@Autowired
	private UserService<User, String> userService;
	
	@ResponseBody
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public void addUser(HttpServletRequest request){
		userService.save(null);
	}
	
}
