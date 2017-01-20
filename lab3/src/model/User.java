package model;

import org.springframework.stereotype.Component;

@Component
public class User {
	String name;
	String email;
	public String getName() {
		return name;
	}
public 	User()
	{
		
	}
public User(String n,String email,String pwd)
{
	this.email=email;
	this.name=n;
	this.password=pwd;
}

public User(String email,String pwd)
{
	this.email=email;
	this.password=pwd;
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
	String password;

}
