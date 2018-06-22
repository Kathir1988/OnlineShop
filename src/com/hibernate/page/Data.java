package com.hibernate.page;

public class Data {
	
	public long Reg_id;
	public String name;
	public String password;
	public String email;
	public long getReg_id() {
		return Reg_id;
	}
	public void setReg_id(long reg_id) {
		Reg_id = reg_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
