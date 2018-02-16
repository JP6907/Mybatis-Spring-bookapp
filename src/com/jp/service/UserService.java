package com.jp.service;

import com.jp.po.User;

/**
 * 
 * @ClassName:  UserService   
 * @Description:TODO(User服务层接口)   
 * @author      ZJP
 * @date:2018年1月31日 下午3:01:52
 */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	public User login(String loginname,String password);

}
