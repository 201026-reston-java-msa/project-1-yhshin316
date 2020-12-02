package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardingMasterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("We're in the master servlet Get");
		try {
			req.getRequestDispatcher(RequestHelper.process(req,resp)).forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//req.getRequestDispatcher("a string goes here").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("We're in the master servlet Post");
		
		//req.getRequestDispatcher("a string goes here").forward(req, resp);
		try {			
			req.getRequestDispatcher(RequestHelper.process(req,resp)).forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("We're in the master servlet Put");
		
		//req.getRequestDispatcher("a string goes here").forward(req, resp);
		try {
			req.getRequestDispatcher(RequestHelper.process(req,resp)).forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
