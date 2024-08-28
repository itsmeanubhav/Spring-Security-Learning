package com.springSecurity.jdbcAuthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")						//No authentication for this api url
	public String home() {
		return ("<h1> Welcome to Home URL<h1>");
	}
	
	@GetMapping("/user")				   //Should be accessible only by persons having roles USER and ADMIN
	public String user() {
		return ("<h1> Welcome User<h1>");
	}
	
	@GetMapping("/admin")				  //Could be only accessible by ADMIN
	public String admin() {
		return ("<h1> Welcome ADMIN<h1>");
	}
}
