package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;

public class GetProfileController {

	public static String getProfile(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("In get Profile Controller");
		
		Employee e = (Employee) req.getSession().getAttribute("sessionuser");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String Emp = objectMapper.writeValueAsString(e);
		res.setContentType("application/json");
		res.getWriter().write(Emp);
		
		return null;
		
		
		
	}
	
}
