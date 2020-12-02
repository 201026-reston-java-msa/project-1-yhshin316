package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.model.Employee;
import com.revature.service.EmployeeService;

public class LoginController {

	public static String checklogin(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("In Login Controller");
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		
		EmployeeService ser = new EmployeeService();
		Employee emp = ser.checkLogin(user,pass);
		
		if(emp != null) {
			req.getSession().removeAttribute("sessionuser");
			req.getSession().setAttribute("sessionuser", emp);
			return "/Reim/home";
		}
		System.out.println("Returned to index");
		return "/Login.html";
		
	}

}
