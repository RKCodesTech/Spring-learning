package com.riya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class StudentController {

    @GetMapping("/hello")
    public String hello(Model model) {
    	model.addAttribute("name" ,"Riya");	
        return "hello";
    }
    @GetMapping("/student-form")
    public String showForm() {
    	return "student-form";
    }
@PostMapping("/student")
public String addStudent(
		@RequestParam("name") String name,
		@RequestParam("rollno") int rollno,
		@RequestParam("marks") int marks
		) {
	return "student-form";
}
}