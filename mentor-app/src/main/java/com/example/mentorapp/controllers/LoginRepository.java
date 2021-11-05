package com.example.mentorapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentorapp.entities.Login;


public interface LoginRepository  extends JpaRepository<Login,Integer> {

}
