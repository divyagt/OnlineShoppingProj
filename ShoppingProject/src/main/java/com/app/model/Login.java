package com.app.model;

public class Login {
String email;
String Password;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Login(String email, String password) {
	super();
	this.email = email;
	Password = password;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}

}
