package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetProfilePageController {

	public static String getProfilePage(HttpServletRequest request, HttpServletResponse response) throws IOException {

		return "/profile.html";
		
	}
	
}
