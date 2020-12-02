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
@Table(name="ReimType")
public class ReimType implements Serializable {
	
	private static final long serialVersionUID = 4829269375085304484L;
	@Id
	@Column(name="type_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="type")
	String type;

	public ReimType() {
		// TODO Auto-generated constructor stub
	}

	public ReimType(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ReimType [id=" + id + ", type=" + type + "]";
	}
	
	

}
