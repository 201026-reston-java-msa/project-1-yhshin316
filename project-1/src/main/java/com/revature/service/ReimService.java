package com.revature.service;

import java.util.List;

import com.revature.DAO.ReimDAOImpl;
import com.revature.model.Employee;
import com.revature.model.Reim;
import com.revature.model.ReimStatus;
import com.revature.model.ReimType;

public class ReimService {
	
	ReimDAOImpl impl = new ReimDAOImpl();
	
	public List<Reim> getAllReim(){
		List<Reim> Reims = impl.getAllReim();
		return Reims;
	}
	
	public List<Reim> getEmployeeReim(int id){
		List<Reim> Reims = impl.getEmployeeReim(id);
		return Reims;
	}
	
	public void updateReim(Reim reim) {
		impl.updateReim(reim);
	}

	public Reim inputReim(Reim reim) {
		System.out.println("In Reim new ticket");
		return impl.inputReim(reim);
	}
	
	public void updateStatusByID(int id, int status, int mana) {
		impl.updateStatusByID(id, status, mana);
	}
	
}
