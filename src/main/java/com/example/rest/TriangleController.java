package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TriangleController {
	@GetMapping("/TriangleType")
	public String getTriangleType(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c) {
		// all the sides are equal
		if (a == b && b == c) 
	        return "Equilateral"; 
		// only two sides are equal
	    else if (a == b || b == c || a == c) 
	        return "Isosceles"; 
	    else
	        return "Scalene"; 
	}
}
