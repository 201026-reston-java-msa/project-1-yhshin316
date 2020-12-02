package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeListPageController {
	
	public static String getEmployeeListPage(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("EmployeeList page controller");

		return "/EmployeeList.html";

	}

}
