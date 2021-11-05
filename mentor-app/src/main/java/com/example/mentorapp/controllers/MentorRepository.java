package com.example.mentorapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentorapp.entities.Mentor;

public interface MentorRepository extends JpaRepository<Mentor,Integer>{

}
