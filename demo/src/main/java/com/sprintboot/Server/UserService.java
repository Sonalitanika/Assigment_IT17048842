package com.sprintboot.Server;
import java.util.List;
import com.springboot.model.User;
public interface UserService {
	
    public void adduser(User user);
    
    public List<User> getAllUser();
 
    public void deleteUser(Integer userId);
 
    public User getUser(int userid);
 
    public User updateUser(User user);
}

