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
import com.revature.service.EmployeeService;
import com.revature.service.ReimService;

public class UpdateReimController {
	
	public static String updateReim(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now(); // Gets the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
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
		Employee emp = new Employee();
		int emp_id = Integer.parseInt(req.getParameter("employee_id"));
		status.setId(emp_id);
		
		Employee em = (Employee) req.getSession().getAttribute("sessionuser");
		
		
		Reim reim = new Reim(amount,des,type,status,date2,emp,em);
		ReimService serv = new ReimService();
		//serv.
		
		System.out.println("Returned to index");
		return "/index.html";
		
	}

}
