package com.revature.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Employee;
import com.revature.model.Reim;
import com.revature.model.ReimStatus;
import com.revature.model.ReimType;
import com.revature.service.ReimService;

public class InputReimController {
	
	public static String inputReim(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		Reim reim = new Reim();
		
		LocalDate date = LocalDate.now(); // Gets the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date2 = date.format(formatter);
		
		
		System.out.println("In Reim update Controller");
		double amount = Double.parseDouble(req.getParameter("amount"));
		String des = req.getParameter("description");
		
		ReimType type = new ReimType();
		int type_id = Integer.parseInt(req.getParameter("type"));
		type.setId(type_id);
		
		ReimStatus status = new ReimStatus();
		int status_id = Integer.parseInt(req.getParameter("status"));
		status.setId(status_id);
		
		Employee empl = (Employee) req.getSession().getAttribute("sessionuser");
		
		reim.setAmount(amount);
		reim.setDate(date2);
		reim.setDescription(des);
		reim.setEmployeeid(empl);
		reim.setStatus(status);
		reim.setType(type);
		
		ReimService serv = new ReimService();
		serv.inputReim(reim);
		System.out.println(reim);
		
		System.out.println("Returned to home");
		return "/Reim/home";
		
	}

}
