package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.model.Reim;
import com.revature.service.ReimService;


public class GetUserController {

	public static String getUser(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		ReimService serv = new ReimService();
//		List<Reim> Reims = serv.getAllReim();
//		ObjectMapper mapper = new ObjectMapper();
//		String Re = mapper.writeValueAsString(Reims);
		
		Employee e = new Employee();
		e.setId(1);
		e.setUsername("user");
		e.setPassword("pass");
		String empl = e.toString();
		res.setContentType("application/json");
		res.getWriter().write(empl);
		
		return null;
		
	}
	
}
