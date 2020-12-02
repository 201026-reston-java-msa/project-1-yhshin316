package com.revature.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reim")
public class Reim implements Serializable{
	
	private static final long serialVersionUID = -4921984819124752139L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="amount")
	private double amount;
	@Column(name="description")
	private String description;
	@ManyToOne(optional = true)
	@JoinColumn(name="type_id")
	private ReimType type;
	@ManyToOne(optional = true)
	@JoinColumn(name="status_id")
	private ReimStatus status;
	@Column(name="date")
	private String date;
	@ManyToOne(optional = true)
	@JoinColumn(name="employee_id")
	private Employee employeeid;
	@ManyToOne(optional = true)
	@JoinColumn(name="manager_id")
	private Employee managerid;

	public Reim() {
		// TODO Auto-generated constructor stub
	}

	public Reim(double amount, String description, ReimType type, ReimStatus status, String date, Employee employeeid,
			Employee managerid) {
		super();
		this.amount = amount;
		this.description = description;
		this.type = type;
		this.status = status;
		this.date = date;
		this.employeeid = employeeid;
		this.managerid = managerid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ReimType getType() {
		return type;
	}

	public void setType(ReimType type) {
		this.type = type;
	}

	public ReimStatus getStatus() {
		return status;
	}

	public void setStatus(ReimStatus status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Employee getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Employee employeeid) {
		this.employeeid = employeeid;
	}

	public Employee getManagerid() {
		return managerid;
	}

	public void setManagerid(Employee managerid) {
		this.managerid = managerid;
	}

	@Override
	public String toString() {
		return "Reim [id=" + id + ", amount=" + amount + ", description=" + description + ", type=" + type + ", status="
				+ status + ", date=" + date + ", employeeid=" + employeeid + "]";
	}
	
	
	

}
