package com.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	

private int id;
private String name;
private long phone;
private String email;
private String password;
private String confirmpassword;
private String address;

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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

public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Customer(String name, long phone, String email, String password, String confirmpassword, String address) {
	super();
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.address = address;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
    return "Customer [id=" + id + ", Name=" + name + ", phone=" + phone + ", emailId=" + email+"password:"+password+"confirm password:" +confirmpassword+
    		"Address:" +address  + "]";
}
}
