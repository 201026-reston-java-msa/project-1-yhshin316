package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.service.EmployeeService;

public class ReimInputInfoController {
	
	public static String getReimInputInfo(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("In ReimInput Controller");
		Employee empl = (Employee) req.getSession().getAttribute("sessionuser");
		
		ObjectMapper mapper = new ObjectMapper();
		String Re = mapper.writeValueAsString(empl);
		res.setContentType("application/json");
		res.getWriter().write(Re);
		
		System.out.println("Returned to index");
		return "/Reim/ReimInputPage";
		
	}

}
