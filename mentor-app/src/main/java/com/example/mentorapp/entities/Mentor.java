package com.example.mentorapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	public String name;
	String course;
	String descp;
	int rating;
	int fees;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getDescp() {
		return descp;
	}


	public void setDescp(String descp) {
		this.descp = descp;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Mentor [id=" + id + ", name=" + name + ", course=" + course + ", descp=" + descp + ", rating=" + rating
				+ ", fees=" + fees + "]";
	}
	
	

}
