package com.jp.mapper;

import org.apache.ibatis.annotations.Param;

import com.jp.po.User;
import com.jp.po.UserQueryVo;

public interface UserMapperCustom {
	
    User selectByLoginnameAndPassword(@Param("loginname")String loginname, 
    									@Param("password")String password);
    
}