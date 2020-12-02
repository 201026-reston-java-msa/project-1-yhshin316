package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.Employee;

public class HomePageController {

	public static String getHomePage(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		System.out.println("In home page controller");
		Employee e = (Employee) session.getAttribute("sessionuser");
		System.out.println(e.getRole().getId());
			if(e.getRole().getId()==1) {
				return "/EmployeeHome.html";
			}else if (e.getRole().getId()==2) {
				return "/Home.html";
			}else {
				return "/Reim/login.html";
			}
		}

}
