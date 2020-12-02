package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;

public class UpdateProfileController {
	
	public static String updateProfile(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("In update Profile Controller");
		Employee e = (Employee) req.getSession().getAttribute("sessionuser");
		int id = e.getId();
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		String first = req.getParameter("firstname");
		String last = req.getParameter("lastname");
		String email = req.getParameter("email");
		String role = req.getParameter("role");
		
		req.getSession().invalidate();
		EmployeeService ser = new EmployeeService();
		Employee emp = ser.update(id,user,pass,first,last,email,role);
		
		if(emp != null) {
			req.getSession().setAttribute("sessionuser", emp);
			return "/Reim/home";
		}
		System.out.println("Returned to index");
		return "/index.html";
		
	}

}
