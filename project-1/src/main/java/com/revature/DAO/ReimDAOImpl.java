package com.revature.DAO;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Reim;
import com.revature.util.HibernateUtil;

public class ReimDAOImpl {

	Session session = HibernateUtil.getSession();
	private static Logger log = Logger.getLogger(ReimDAOImpl.class);

	@SuppressWarnings("unchecked")
	public List<Reim> getAllReim() {
		log.info("All Reimbursement list were pulled");
		List<Reim> Reims = session.createQuery("from Reim").list();
		session.clear();
		return Reims;
	}

	@SuppressWarnings("unchecked")
	public List<Reim> getEmployeeReim(int id) {
		log.info("Reimbursements from specific employee was pulled");
		String hql = "From Reim where employee_id = :id";
		List<Reim> Reims = session.createQuery(hql).setParameter("id", id).list();
		session.clear();
		return Reims;
	}

	public void updateReim(Reim reim) {
		log.info("Reimbursement was updated");
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(reim);
		tx.commit();
		session.clear();
	}

	public Reim inputReim(Reim reim) {
		log.info("New Reimbursement request was posted");
		System.out.println("DAO Reim input");
		Session ses = HibernateUtil.getSession(); // capture the session
		Transaction tx = ses.beginTransaction(); // perform an operation on DB
		try {
			System.out.println(reim);
			ses.save(reim);
			tx.commit();
			ses.clear();
			return reim;

		} catch (Exception e) {
			tx.rollback();
			System.out.println("Reim input failed");
			return null;
		}

	}

	public void updateStatusByID(int id, int status, int mana) {
		log.info("Reimbursement request has been updated");
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		String hqlUpdate = "update Reim set status_id = :status_id, manager_id = :manager_id where id = :id";

		session.createQuery(hqlUpdate).setParameter("status_id", status).setParameter("manager_id", mana)
				.setParameter("id", id).executeUpdate();

		tx.commit();
		session.clear();
	}

}
