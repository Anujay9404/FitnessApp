package com.example.mentorapp.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentorapp.entities.User;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(path="/users",method= RequestMethod.POST)
	public void register(@RequestBody User user){
		System.out.println("add user for register method involked...");
		System.out.println(user);
//		return null;
		userRepository.save(user);
	}
//	@RequestMapping(path = "/login", method = RequestMethod.POST)
//	public void login(@RequestParam(value = "email", required = false) String email, @RequestParam(value = "password", required = false) String password) {
//		
//	}
	
	@RequestMapping(path="/user",method=RequestMethod.PATCH)
	public void register(@RequestParam(value = "course", required = false) String course,@RequestBody User user) {
		System.out.println(course);
		System.out.println(user);
		
		userRepository.save(user);
	}
	
}
