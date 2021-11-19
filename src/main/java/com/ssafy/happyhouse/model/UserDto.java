package com.ssafy.happyhouse.model;

public class UserDto {

	private String id;
	private String password;
	private String name;
	private String address;
	
	public UserDto() {}
	
	public UserDto(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public UserDto(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
