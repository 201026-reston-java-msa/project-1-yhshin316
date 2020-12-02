package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReimInputPageController {

	public static String getReimInputPage(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Returned to Reim Input Page");
		return "/ReimRequest.html";
		
	}
	
}
