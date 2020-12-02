package com.revature.DAO;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

import com.revature.model.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDAOImpl {

	Session session = HibernateUtil.getSession();
	private static Logger log = Logger.getLogger(EmployeeDAOImpl.class);

//	Cipher cipher;
//	static SecretKey secretKey;

//	public void getKey() throws NoSuchAlgorithmException, NoSuchPaddingException {
//
//		System.out.println("DAO getKey");
//		List<Encryption> codes = session.createQuery("from Encryption").list();
//
//		try {
//			Encryption code = codes.get(0);
//			byte[] decoder = code.getCode();
//			EmployeeDAOImpl.secretKey = new SecretKeySpec(decoder, "AES");
//			session.clear();
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//			keyGenerator.init(128); // block size is 128bits
//			SecretKey newKey = keyGenerator.generateKey();
//			cipher = Cipher.getInstance("AES");
//
//			byte[] bytes = newKey.getEncoded();
//			Encryption en = new Encryption();
//			en.setCode(bytes);
//
//			Transaction tx = session.beginTransaction();
//			session.save(en);
//			tx.commit();
//			session.clear();
//
//			EmployeeDAOImpl.secretKey = newKey;
//			e.printStackTrace();
//
//		}
//
//	}
//
//	public String encrypt(String plainText, SecretKey secretKey) throws Exception {
//		byte[] plainTextByte = plainText.getBytes();
//		cipher = Cipher.getInstance("AES");
//		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//		byte[] encryptedByte = cipher.doFinal(plainTextByte);
//		Base64.Encoder encoder = Base64.getEncoder();
//		String encryptedText = encoder.encodeToString(encryptedByte);
//		return encryptedText;
//	}
//
//	public String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
//		Base64.Decoder decoder = Base64.getDecoder();
//		byte[] encryptedTextByte = decoder.decode(encryptedText);
//		cipher = Cipher.getInstance("AES");
//		cipher.init(Cipher.DECRYPT_MODE, secretKey);
//		byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
//		String decryptedText = new String(decryptedByte);
//		return decryptedText;
//	}

	@SuppressWarnings("unchecked")
	public Employee checkLogin(String username, String password) throws Exception {
		Session session = HibernateUtil.getSession();
		Criteria crit = session.createCriteria(Employee.class);
		crit.add(Restrictions.and(Restrictions.eq("username", username), Restrictions.eq("password", password)));
		List<Employee> userList = crit.list();
		System.out.println(userList.toString());
		try {
			session.clear();
			Employee empl = userList.get(0);
			log.info(empl.getUsername() + " logged in");
			return empl;
		} catch (Exception e) {
			System.out.println("Failed checklogin");
			session.clear();
			return null;
		}
	}

	public Employee register(Employee em) throws NoSuchAlgorithmException, NoSuchPaddingException {
		System.out.println("Inside register dao");
		Session ses = HibernateUtil.getSession(); // capture the session
		Transaction tx = ses.beginTransaction(); // perform an operation on DB

		try {
			log.info(em.getUsername() + " registered");
			ses.save(em); // use the save() session method to perform an insert operation
			tx.commit(); // commit the transaction by utilizing the methods from the Transaction							
			ses.clear();
			return em;

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Employee save failed");
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() throws Exception {

		log.info("All employee list was pulled");
		List<Employee> Employees = session.createQuery("from Employee").list();
		session.clear();
		System.out.println(Employees.toString());
		return Employees;
	}

	public Employee updateEmployees(Employee em) throws Exception {
		log.info(em.getUsername() + "'s profile was updated");
		System.out.println(em.getId());
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(em);
		tx.commit();
		session.clear();
		return em;
	}

}
