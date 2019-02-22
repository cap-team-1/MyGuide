package com.mirza.pojo;

public class ValidationPojo {
private String userName;
private String password;
public ValidationPojo() {
	
}
public ValidationPojo(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Validation [userName=" + userName + ", password=" + password + "]";
}

}
