package org.antwalk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.antwalk.Dao.ValentineDao;

import org.antwalk.model.Movie;
import org.antwalk.model.User;
import org.antwalk.model.Valentine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	ValentineDao value = (ValentineDao) context.getBean("ValentineDao");
	@Autowired
	ValentineDao value;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("welcome")
	public String welcome(HttpServletRequest request)
	{
		String firstName =request.getParameter("firstName");
		request.setAttribute("fName", firstName);
		return "welcome";
	}
	@RequestMapping("show")
	public ModelAndView showModel(HttpServletRequest request)
	{
		ModelAndView mv =new ModelAndView("showModel");
		Movie movie = new Movie("TSroy",2002,"5 star",180);
		String name="upasana";
		List<String> cities=new ArrayList();
		cities.add("Mumbai");
		cities.add("Bengaluru");
		cities.add("Delhi");
		cities.add("Kolkata");
		mv.addObject("name",name);
		mv.addObject("model",movie);
		mv.addObject("list",cities);
		return mv;
	
	}
	
	@RequestMapping("user") 
	public ModelAndView showUser()
	{
		ModelAndView mv=new ModelAndView("UserForm");
		User usr=new User();
		Map<String, String> genderMap=new HashMap();
		genderMap.put("male","Male");
		genderMap.put("female","Female");
		Map<String, String> countryMap=new HashMap();
		countryMap.put("India", "India");
		countryMap.put("Australia", "Autralia");
		countryMap.put("USA", "USA");
		countryMap.put("China", "China");
		
		mv.addObject("user",usr);
		mv.addObject("country",countryMap);
		mv.addObject("gender",genderMap);
		return mv;
	}
	@RequestMapping("valentine") 
	public ModelAndView showvalenDetails()
	{
		ModelAndView mv=new ModelAndView("valentineForm");
		Valentine val=new Valentine();
		mv.addObject("valentine",val);
		return mv;
	}
	

	
	@RequestMapping("userInfo")
	public ModelAndView showUserInfo(@ModelAttribute User user)
	{
		ModelAndView mv=new ModelAndView("userInfo");//showModel bean
		mv.addObject("usr",user);
		return mv;
	}
	@RequestMapping("status")
	public ModelAndView showStatus(@ModelAttribute Valentine valentine)
	{
		ModelAndView mv=new ModelAndView("status");
		mv.addObject("val",valentine);
		value.create(valentine.getDay(),valentine.getGift(),valentine.getLocation());
		return mv;
	}
}
