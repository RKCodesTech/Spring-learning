package com.riya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {

    @RequestMapping("/hello")
    public String hello(Model model) {
    	model.addAttribute("name" ,"Riya");
    	
        return "hello";
    }

}