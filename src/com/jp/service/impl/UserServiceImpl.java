package com.jp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.mapper.UserMapper;
import com.jp.mapper.UserMapperCustom;
import com.jp.po.User;
import com.jp.po.UserCustom;
import com.jp.po.UserQueryVo;
import com.jp.service.UserService;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserMapperCustom userMapperCustom;

	@Override
	public User login(String loginname, String password) {
		System.out.println("登陆: loginname:" + loginname + "  password:" + password);
//		UserCustom userCustom = new UserCustom();
//		UserQueryVo userQueryVo = new UserQueryVo();
//		userCustom.setLoginname(loginname);
//		userCustom.setPassword(password);
//		userQueryVo.setUserCustom(userCustom);
		return userMapperCustom.selectByLoginnameAndPassword(loginname, password);
	}

}
