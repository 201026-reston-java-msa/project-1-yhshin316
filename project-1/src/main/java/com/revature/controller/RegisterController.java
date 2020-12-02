package com.revature.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;

public class RegisterController {

	
	
	public static String register(HttpServletRequest req, HttpServletResponse res) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException {
		// TODO Auto-generated method stub
		
		System.out.println("In register Controller");
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		String first = req.getParameter("firstname");
		String last = req.getParameter("lastname");
		String email = req.getParameter("email");
		String role = req.getParameter("role");
		
		req.getSession().removeAttribute("sessionuser");
		EmployeeService ser = new EmployeeService();
		Employee emp = ser.register(user,pass,first,last,email,role);
		
		if(emp != null) {
			
			req.getSession().setAttribute("sessionuser", emp);
			return "/Reim/home";
		}
		System.out.println("Returned to index");
		return "/Login.html";
		
	}
	
}
