package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;
import service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService service;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String loginView()
	{
		return "login";
	}
@RequestMapping(value="/LoginController",method=RequestMethod.POST)
public ModelAndView authenticate(@RequestParam("email") String email,@RequestParam("password") String pwd)
{
	ModelAndView model=new ModelAndView();
	User user1=new User(email,pwd);
	if(service.authenticate(user1))
	{
		
	
		model.setViewName("welcome");
		model.addObject("user", user1);
	}
	else
		model.setViewName("login");
	return model;
}
}
