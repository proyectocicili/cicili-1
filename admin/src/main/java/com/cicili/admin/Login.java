package com.cicili.admin;

import javax.servlet.ServletException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Login {
	
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login(@RequestBody User login) throws ServletException {

	    String jwtToken = "";

	    if (login.getEmail() == null || login.getPassword() == null) {
	        throw new ServletException("Please fill in username and password");
	    }

	    String email = login.getEmail();
	    String password = login.getPassword();

	    User user = userService.findByEmail(email);

	    if (user == null) {
	        throw new ServletException("User email not found.");
	    }

	    String pwd = user.getPassword();

	    if (!password.equals(pwd)) {
	        throw new ServletException("Invalid login. Please check your name and password.");
	    }

	    jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
	            .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

	    return jwtToken;
	}
	

}
