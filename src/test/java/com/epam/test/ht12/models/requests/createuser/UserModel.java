package com.epam.test.ht12.models.requests.createuser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("password")
	private String password;

	@JsonProperty("userStatus")
	private int userStatus;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("id")
	private long id;

	@JsonProperty("email")
	private String email;

	@JsonProperty("username")
	private String username;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setUserStatus(int userStatus){
		this.userStatus = userStatus;
	}

	public int getUserStatus(){
		return userStatus;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"UserModel{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",password = '" + password + '\'' + 
			",userStatus = '" + userStatus + '\'' + 
			",phone = '" + phone + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}