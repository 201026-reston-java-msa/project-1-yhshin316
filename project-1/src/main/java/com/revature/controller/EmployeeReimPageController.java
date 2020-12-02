package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Employee;

public class EmployeeReimPageController {
	
	public static String getReimPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("In reim page controller");
		Employee e = (Employee) request.getSession().getAttribute("sessionuser");
		System.out.println("Role number is : " + e.getRole().getId());
			return "/EmployeeReim.html";
	}

}
