package com.spring.user.impl;

import com.spring.user.UserService;
import com.spring.user.UserVO;
import com.spring.user.dao.UserDAO;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		
		return userDAO.getUser(vo);
	}
	

}
