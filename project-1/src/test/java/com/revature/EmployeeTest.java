package com.revature;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.NoSuchPaddingException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.revature.DAO.EmployeeDAOImpl;
import com.revature.service.EmployeeService;
import com.revature.model.Employee;
import com.revature.model.Role;

public class EmployeeTest {

	@Mock
	private EmployeeDAOImpl daoMock;

	// @InjectMocks will inject the mocks marked with @Mock to this instance when it
	// is created
	@InjectMocks
	private EmployeeService service;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void testregister_returnEmployee() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Employee e = new Employee();
		e.setId(1);
		e.setUsername("a");
		e.setPassword("a");
		e.setFirstName("a");
		e.setLastName("a");
		e.setEmail("a");
		Role r = new Role();
		r.setId(1);
		e.setRole(r);
		
		Employee em = new Employee();
		em.setId(1);
		em.setUsername("a");
		em.setPassword("a");
		em.setFirstName("a");
		em.setLastName("a");
		em.setEmail("a");
		Role ro = new Role();
		ro.setId(1);
		em.setRole(r);
		
		when(daoMock.register(e)).thenReturn(em);

		assertEquals(service.register("a", "a", "a", "a", "a", "1"), null);

	}
	
	@Test
	public void getAllEmployees_returnsList() throws Exception{
		
		List<Employee> em = new ArrayList<>();
		
		when(daoMock.getAllEmployees()).thenReturn(em);

		assertEquals(service.getAllEmployees(), em);
	}
	
	@Test
	public void update_returnEmployee() throws Exception {
		
		Employee em = new Employee();
		
		when(daoMock.updateEmployees(em)).thenReturn(em);
		
		assertEquals(service.update(1,"a","a","a","a","a","3"), null);
	}

}
