package com.project.person.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PeopleController {
	
	 @GetMapping
	    public String listAll() {
	        return "API OK ";
	    }

}
