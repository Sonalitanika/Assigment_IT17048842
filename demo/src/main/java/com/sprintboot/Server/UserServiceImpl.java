package com.sprintboot.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.UserDAO;
import com.springboot.model.User;
public class UserServiceImpl implements UserService {
	
	 @Autowired
	    private UserDAO userDAO;
	 
	    @Override
	    @Transactional
	    public void adduser(User user) {
	        userDAO.adduser(user);
	    }
	 
	    @Override
	    @Transactional
	    public List<User> getAllUser() {
	        return userDAO.getAllUser();
	    }
	 
	    @Override
	    @Transactional
	    public void deleteUser(Integer userId) {
	        userDAO.deleteUser(userId);
	    }
	 
	    public User getUser(int userid) {
	        return userDAO.getUser(userid);
	    }
	 
	    public User updateUser(User user) {
	        // TODO Auto-generated method stub
	        return userDAO.updateUser(user);
	    }
	 
	    public void setEmployeeDAO(UserDAO userDAO) {
	        this.userDAO = userDAO;
	    }


			
		
}
