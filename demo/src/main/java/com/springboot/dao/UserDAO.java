package com.springboot.dao;

import java.util.List;
import com.springboot.model.User;
public interface UserDAO {

    public void adduser(User user);
    
    public List<User> getAllUser();
 
    public void deleteUser(Integer userId);
 
    public User updateUser(User user);
 
    public User getUser(int userid);
}
