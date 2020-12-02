package com.revature;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.revature.DAO.ReimDAOImpl;
import com.revature.model.Reim;
import com.revature.service.ReimService;

public class ReimTest {

	@Mock
	private ReimDAOImpl daoMock;

	@InjectMocks
	private ReimService service;

	@Test
	public void testgetAllReim_returnList() {

		List<Reim> r = new ArrayList<>();
		Reim re = new Reim();
		r.add(0, re);

		try {
			when(daoMock.getAllReim()).thenReturn(r);

			assertEquals(service.getAllReim(), r);
		} catch (Exception e) {

		}

	}

	@Test
	public void testgetEmployeeReim_returnList() {

		List<Reim> r = new ArrayList<>();
		Reim re = new Reim();
		r.add(0, re);

		int id = 1;
		try {
			when(daoMock.getEmployeeReim(id)).thenReturn(r);

			assertEquals(service.getEmployeeReim(id), r);
		} catch (Exception e) {

		}
	}

}
