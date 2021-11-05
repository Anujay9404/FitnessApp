package com.example.mentorapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentorapp.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
