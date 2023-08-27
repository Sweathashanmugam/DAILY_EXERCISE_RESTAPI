package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_task")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String post;
	private String email;
	private String password;
	private long salary;
	public UserModel(int eid, String ename, String post, String email, String password, long salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.post = post;
		this.email = email;
		this.password = password;
		this.salary = salary;
	}
	public UserModel() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
