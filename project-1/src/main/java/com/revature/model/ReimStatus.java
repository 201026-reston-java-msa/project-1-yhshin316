package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ReimStatus")
public class ReimStatus implements Serializable {
	
	private static final long serialVersionUID = -8076360648313915443L;
	@Id
	@Column(name="status_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="status")
	String status;

	public ReimStatus() {
		// TODO Auto-generated constructor stub
	}

	public ReimStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ReimStatus [id=" + id + ", status=" + status + "]";
	}
	
	

}
