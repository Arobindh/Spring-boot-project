package com.arobindh.demo;

import java.lang.module.FindException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User_controller {
	@Autowired
	Userrep Us;
	@RequestMapping("/")
	public String home()
	{
		return "Home.jsp";
	}
	
	@PostMapping("/User")
	@ResponseBody
	public String addUser(User U)
	{
		Us.save(U);
		return "User added";
	}
	@PutMapping(path="/User",consumes="application/json")
	@ResponseBody
	public User updateUser(@RequestBody User U)
	{
		Us.save(U);
		return U;
	}
//	@RequestMapping("/fetch")
//	public ModelAndView fetchUser(@RequestParam int userId)
//	{
//		ModelAndView mv=new ModelAndView("ShowUser.jsp");
//		User rock = Us.findById(userId).orElse(new User());
//		mv.addObject(rock);
//		System.out.println(Us.findByname("Arobindh"));
//		System.out.println(Us.findByuserIdGreaterThan(1));
//		System.out.println(Us.findBynamesorted("Arobindh"));
//		return mv; 
//	}
	
	@GetMapping(path="/User", produces = "application/json")
	@ResponseBody
	public List<User> fetchAllUser()
	{
		
		return Us.findAll(); 
	}
	@GetMapping("/User/{userID}")
	@ResponseBody
	public Optional<User> fetchAllUserByid(@PathVariable("userID") int userId)
	{
		
		return Us.findById(userId); 
	}
	@DeleteMapping("/User/{userID}")
	@ResponseBody
	public String deleteUserByid(@PathVariable("userID") int userId)
	{
		User tom=Us.getOne(userId);
		Us.delete(tom);
		return "deleted";
	}
}
 