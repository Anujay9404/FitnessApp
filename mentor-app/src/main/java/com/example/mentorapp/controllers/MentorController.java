package com.example.mentorapp.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentorapp.entities.Mentor;

@CrossOrigin
@RestController
public class MentorController {

	@Autowired
	MentorRepository mentorRepository;
	
	@RequestMapping(path="/mentors",method= RequestMethod.GET)
	public List<Mentor> fetchAllMentor(){
		System.out.println("fetch all mentor method involked...");
//		return null;
		return mentorRepository.findAll();
	}
	
	@RequestMapping(path= "/mentors",method= RequestMethod.POST)
	public void addWorkout(@RequestBody(required = false) Mentor mentor){
		System.out.println("add mentor method involked...");
		System.out.println(mentor);
		//db insert
		mentorRepository.save(mentor);
		
	}
	
	@RequestMapping(path = "/mentors/{mentorid}", method = RequestMethod.DELETE)
//	@DeleteMapping("/{mentorid}")
	public void deleteWorkout(@PathVariable("mentorid") int mentorId){
		System.out.println(mentorId);
		mentorRepository.deleteById(mentorId);
	}
	
//	@PatchMapping("/{mentorid}")
//	public void updatetWorkout(@PathVariable("mentorid") int mentorId,@RequestBody Mentor mentor) {
//		
//		Mentor mentorToBeUpdated = null; 
//		// find an existing mentor
//		Optional<Mentor> mentorFound = mentorRepository.findById(mentorId);
//		if(mentorFound.isPresent()) {
//			mentorToBeUpdated = mentorFound.get();
//		}
//		if(mentor.name!=null && mentor.name!="") {
//			mentorToBeUpdated.setName(mentor.name);
//		}
//		System.out.println(mentorToBeUpdated);
//		mentorRepository.save(mentorToBeUpdated);
//	}
	
}
