package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;

public class TestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		Employee e = new Employee();
		e.setId(1);
		e.setUsername("username");
		e.setPassword("password");
		
		ObjectMapper mapper = new ObjectMapper();
		String emp = mapper.writeValueAsString(e);
		res.setContentType("application/json");
		res.getWriter().write(emp);
	}
	
}
