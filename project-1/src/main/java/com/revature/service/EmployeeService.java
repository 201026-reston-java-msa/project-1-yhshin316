package com.revature.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.crypto.NoSuchPaddingException;

import com.revature.DAO.EmployeeDAOImpl;
import com.revature.model.Employee;
import com.revature.model.Role;

public class EmployeeService {
	EmployeeDAOImpl impl = new EmployeeDAOImpl();

	public Employee checkLogin(String username, String password) throws Exception {
		System.out.println("In service checklogin");
		return impl.checkLogin(username, password);
	}
	
	public Employee register(String username, String password, String firstname, String lastname, String email, String role) throws NoSuchAlgorithmException, NoSuchPaddingException {
		Employee e = new Employee();
		e.setUsername(username);
		e.setPassword(password);
		e.setFirstName(firstname);
		e.setLastName(lastname);
		e.setEmail(email);
		Role r = new Role();
		r.setId(Integer.parseInt(role));
		e.setRole(r);
		System.out.println("In service register");
		return impl.register(e);
	}
	
	public List<Employee> getAllEmployees() throws Exception {
		System.out.println("In service getAllEmployees");
		return impl.getAllEmployees();
	}

	public Employee update(int id, String user, String pass, String first, String last, String email, String role) throws Exception {
		System.out.println("In service updateEmployee");
		Employee e = new Employee();
		e.setId(id);
		e.setUsername(user);
		e.setPassword(pass);
		e.setFirstName(first);
		e.setLastName(last);
		e.setEmail(email);
		Role r = new Role();
		r.setId(Integer.parseInt(role));
		e.setRole(r);
		return impl.updateEmployees(e);
	}

}
