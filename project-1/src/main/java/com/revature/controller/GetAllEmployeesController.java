package com.revature.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.service.EmployeeService;

public class GetAllEmployeesController {

	public static String getAllEmployees(HttpServletRequest req, HttpServletResponse res) throws Exception {

		EmployeeService serv = new EmployeeService();
		List<Employee> Employees = serv.getAllEmployees();
		ObjectMapper objectMapper = new ObjectMapper();
		String EmployeeList = objectMapper.writeValueAsString(Employees);
		System.out.println(EmployeeList);
		res.setContentType("application/json");
		res.getWriter().write(EmployeeList);

		return null;
	}
	
}
