package com.example.mentorapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentorapp.entities.Login;

@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginRepository loginRepository;
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public void login(@RequestParam(value = "email", required = false) String email, @RequestParam(value = "password", required = false) String password,@RequestBody Login login) {
		System.out.println(email);
		System.out.println(password);
		loginRepository.save(login);
	}

}
