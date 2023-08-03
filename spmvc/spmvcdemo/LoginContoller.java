package com.lvg.spmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lvg.spmvc.beans.User;
import com.lvg.spmvc.dao.UserDao;

@Controller   //bean class or u can call component as well
public class LoginController {
	  
	   @Autowired
	   UserDao udao;
	   
	
       @GetMapping("/login")
       public String getLoginPage()
       {
    	   return "Login";
       }
       
       //@GetMapping("/validateUser") it show userid and pass in url
       @PostMapping("/validateUser")  //to take input in login page  aand we can use ModelMAP as well      
       public String authenticateUser(@RequestParam("uname")String username,@RequestParam("pwd")String password,Model model)
      {  
	   String message = " Invalid username /password ....Sorry!";
	   User user = new User(username,password);
	   //UserDao udao = new UserDao();
	   if(udao.searchUser(user))
	     	message =" Hii  " + username +" welcome to spring MVC world";
	       model.addAttribute("userMessage",message);
	   	return "Display";
        }
       
//modelview
//       public ModelAndView authenticateUser(@RequestParam("uname")String username,@RequestParam("pwd")String password,Model model)
//       {
//  	   String message = " Invalid username /password ....Sorry!";
//  	   if(username.equals("Ajay") && password.equals("Ajay@123"))
//	     	message =" Hii  " + username +" welcome to spring MVC world";
//	      return new ModelAndView("Display","userMessage",message);
//	     
//       }
       
//       
//             public String authenticateUser(@RequestParam("uname")String username,@RequestParam("pwd")String password,Model model)
//     {  
//    	   String message = " Invalid username /password ....Sorry!";
//    	   if(username.equals("Ajay") && password.equals("Ajay@123"))
//   	     	message =" Hii  " + username +" welcome to spring MVC world";
//   	       model.addAttribute("userMessage",message);
//   	   	return "Display";
//      }
//       
       
      @GetMapping("/SignUp")
      public String getSignUp()
      {
    	  return "SignUp";
      }
}
