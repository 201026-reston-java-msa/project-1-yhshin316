package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.model.Reim;
import com.revature.service.ReimService;

public class GetEmployeeReimController {

	public static String getEmployeeReim(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("In Get All Employee Reim controller");
		Employee e = (Employee) request.getSession().getAttribute("sessionuser");
		int id = e.getId();
		ReimService serv = new ReimService();
		List<Reim> Reims = serv.getEmployeeReim(id);
		ObjectMapper objectMapper = new ObjectMapper();
		String ReimList = objectMapper.writeValueAsString(Reims);
		response.setContentType("application/json");
		response.getWriter().write(ReimList);

		return null;
	}
	
}
