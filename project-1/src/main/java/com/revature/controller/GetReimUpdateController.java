package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Employee;
import com.revature.service.ReimService;

public class GetReimUpdateController {
	
	public static String updateReim(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("Reim update page controller");
		int id = Integer.parseInt(req.getParameter("id"));
		int status = Integer.parseInt(req.getParameter("status"));
		Employee mana = (Employee) req.getSession().getAttribute("sessionuser");
		ReimService serv = new ReimService();
		serv.updateStatusByID(id, status, mana.getId());
		return "/Reim/home";

	}

}
