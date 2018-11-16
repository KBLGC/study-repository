package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.UserInfo;
import com.mapper.mapper2.UserInfoMapper;

@Service
public class UserInfoService {
	
	@Autowired
	 private UserInfoMapper userInfoMapper;
     
	@Transactional(rollbackFor=Exception.class)
	 public int addUserInfo(Long userId,String realName){
		 return userInfoMapper.insert(new UserInfo(userId, realName));
	 }
	
}
