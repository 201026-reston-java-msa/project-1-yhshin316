package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterPageController {

	public static String getRegisterPage(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("In register page controller");
		return "/Register.html";
	}
}
