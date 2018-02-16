package com.jp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.po.User;
import com.jp.service.UserService;

/**
 * 处理用户请求控制器
 * */
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public String login(
			 String loginname,String password,
			 Model model,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			System.out.println("登陆成功");
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);

			return "redirect:/book/bookList";
		}else{
			System.out.println("登录名或密码错误");
			// 登录失败，设置失败提示信息，并跳转到登录页面
			model.addAttribute("message", "登录名或密码错误，请重新输入!");
			return "loginForm";
		}
	}
	
	
}
