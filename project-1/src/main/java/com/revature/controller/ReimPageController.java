package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.model.Reim;
import com.revature.service.ReimService;

public class ReimPageController {

	public static String getReimPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("In reim page controller");
		Employee e = (Employee) request.getSession().getAttribute("sessionuser");
		System.out.println("Role number is : " + e.getRole().getId());
			return "/Reim.html";
	}

}
