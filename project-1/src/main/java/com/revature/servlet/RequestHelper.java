package com.revature.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controller.EmployeeReimPageController;
import com.revature.controller.GetAllEmployeesController;
import com.revature.controller.GetAllReimController;
import com.revature.controller.GetEmployeeListPageController;
import com.revature.controller.GetEmployeeReimController;
import com.revature.controller.GetProfileController;
import com.revature.controller.GetProfilePageController;
import com.revature.controller.GetReimUpdateController;
import com.revature.controller.GetReimUpdatePageController;
import com.revature.controller.GetUserController;
import com.revature.controller.HomePageController;
import com.revature.controller.InputReimController;
import com.revature.controller.LoginController;
import com.revature.controller.RegisterController;
import com.revature.controller.RegisterPageController;
import com.revature.controller.ReimInputInfoController;
import com.revature.controller.ReimInputPageController;
import com.revature.controller.ReimPageController;
import com.revature.controller.UpdateProfileController;
import com.revature.model.Employee;

public class RequestHelper {

	public static String process(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("In helper: ");

		System.out.println(request.getRequestURI());
		
		Employee em = (Employee) request.getSession().getAttribute("sessionuser");

		switch (request.getRequestURI()) {

			case "/project-1/Reim/login":
				System.out.println("Case 1");
				return LoginController.checklogin(request, response);
				
			case "/project-1/Reim/registerpage":
				System.out.println("Case 2");
				return RegisterPageController.getRegisterPage(request, response);
				
			case "/project-1/Reim/register":
				System.out.println("Case 3");
				return RegisterController.register(request, response);
				
			case "/project-1/Reim/home":
				System.out.println("Case 4");
				return HomePageController.getHomePage(request, response);
				
			case "/project-1/Reim/Reim":
				System.out.println("Case 5");
				return ReimPageController.getReimPage(request, response);
				
			case "/project-1/Reim/getUser":
				System.out.println("Case 6");
				return GetUserController.getUser(request, response);
				
			case "/project-1/Reim/ReimInput":
				System.out.println("Case 7");
				return ReimInputInfoController.getReimInputInfo(request, response);
			
			case "/project-1/Reim/ReimInputPage":
				System.out.println("Case 8");
				return ReimInputPageController.getReimInputPage(request, response);
				
			case "/project-1/Reim/InputReim":
				System.out.println("Case 9");
				return InputReimController.inputReim(request, response);
				
			case "/project-1/Reim/GetAllReim":
				System.out.println("Case 10");
				return GetAllReimController.getAllReim(request, response);
				
			case "/project-1/Reim/UpdateReim":
				System.out.println("Case 11");
				return GetReimUpdateController.updateReim(request, response);
				
			case "/project-1/Reim/UpdateReimPage":
				System.out.println("Case 12");
				return GetReimUpdatePageController.getReimUpdatePage(request, response);
				
			case "/project-1/Reim/EmployeeListPage":
				System.out.println("Case 13");
				return GetEmployeeListPageController.getEmployeeListPage(request, response);
				
			case "/project-1/Reim/GetAllEmployee":
				System.out.println("Case 14");
				return GetAllEmployeesController.getAllEmployees(request, response);
				
			case "/project-1/Reim/GetEmployeeReim":
				System.out.println("Case 15");
				return GetEmployeeReimController.getEmployeeReim(request, response);
				
			case "/project-1/Reim/GetProfilePage":
				System.out.println("Case 16");
				return GetProfilePageController.getProfilePage(request, response);
				
			case "/project-1/Reim/GetProfile":
				System.out.println("Case 17");
				return GetProfileController.getProfile(request, response);
				
			case "/project-1/Reim/UpdateProfile":
				System.out.println("Case 17");
				return UpdateProfileController.updateProfile(request, response);
				
			case "/project-1/Reim/EmployeeReim":
				System.out.println("Case 18");
				return EmployeeReimPageController.getReimPage(request, response);
			
			default:
				System.out.println("Default");
				return "/Login.html";

		}

//		switch (request.getRequestURI()) {
//
//		// checks login
//		case "/Banking/Bank/login":
//			System.out.println("Case 1");
//			return LoginController.checklogin(request, response);
//
//		// Goes to menu page for All user
//		case "/Banking/Bank/userhome":
//			System.out.println("Case 2");
//			return UserHomeController.userhome(request);
//
//		// Goes to pulls the accounts from database
//		case "/Banking/Bank/accounts":
//			System.out.println("Case 3");
//			return GetAccountsController.getAccounts(request);
//
//		// Returns to index
//		default:
//			System.out.println("In default");
//			return "/index.jsp";
//		}
	}
}
