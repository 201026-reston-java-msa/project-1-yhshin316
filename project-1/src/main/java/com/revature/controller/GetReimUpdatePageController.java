package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetReimUpdatePageController {

	public static String getReimUpdatePage(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("Reim update page controller");

		return "/UpdateReim.html";

	}
	
}
