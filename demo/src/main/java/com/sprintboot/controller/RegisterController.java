package com.sprintboot.controller;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.springboot.model.User;
import com.sprintboot.Server.UserService;

public class RegisterController {
 
		 
		private static final Logger logger = Logger.getLogger(RegisterController.class);
	 
		
		public RegisterController() {
			System.out.println("RegisterController()");
		}
		public UserService userService;
		
		 @RequestMapping(value = "/")
		    public ModelAndView listUser(ModelAndView model) throws IOException {
		        List<User> listUser = userService.getAllUser();
		        model.addObject("listUser", listUser);
		        model.setViewName("home");
		        return model;
		    }
		 
		    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
		    public ModelAndView newContact(ModelAndView model) {
		        User user = new User();
		        model.addObject("user", user);
		        model.setViewName("UserRegister");
		        return model;
		    }
		 
		    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
		    public ModelAndView saveUser(@ModelAttribute User user) {
		        if (user.getId() == 0) { // if  id is 0 then creating the
		            // e other updating the employee
		            userService.adduser(user);
		        } else {
		            userService.updateUser(user);
		        }
		        return new ModelAndView("redirect:/");
		    }
		 
		    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
		    public ModelAndView deleteUser(HttpServletRequest request) {
		        int userId = Integer.parseInt(request.getParameter("id"));
		        userService.deleteUser(userId);
		        return new ModelAndView("redirect:/");
		    }
		 
		    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
		    public ModelAndView editContact(HttpServletRequest request) {
		        int userId = Integer.parseInt(request.getParameter("userid"));
		         User user =UserService.getUser(userId);
		        ModelAndView model = new ModelAndView("UserRegister");
		        model.addObject("user", user);
		 
		        return model;
		    }
}
