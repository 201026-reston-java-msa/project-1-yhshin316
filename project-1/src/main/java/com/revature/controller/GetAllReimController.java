package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.model.Reim;
import com.revature.service.ReimService;

public class GetAllReimController {

	public static String getAllReim(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		ReimService serv = new ReimService();
		List<Reim> Reims = serv.getAllReim();
		ObjectMapper objectMapper = new ObjectMapper();
		String ReimList = objectMapper.writeValueAsString(Reims);
		res.setContentType("application/json");
		res.getWriter().write(ReimList);

		return null;
	}

}
