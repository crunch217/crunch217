package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class account {
	@Id
	@Column(name = "user_Id")
	int user_id;

	@Column(name = "first_name")
	String first_name;

	@Column(name = "last_name")
	String last_name;
	
	@Column(name="user_name")
	String user_name;

	@Column(name = "password")
	String password;
	
	
	public account() {
		super();
	}

	public account(String first_name, String last_name, String password, String user_name) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_name = user_name;
		this.password = password;
		
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "account [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", password="
				+ password + ", user_name=" + user_name + "]";
	}

	

	

}
