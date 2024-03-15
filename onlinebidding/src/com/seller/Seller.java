package com.seller;

public class Seller {
	
	//declare variables
	private int id;
	private String name;
	private String bod;
	private String nic;
	private String address;
	private String email;
	private String phone;
	private String username;
	private String password;
	
	//create overloaded constructor
	public Seller(int id, String name, String bod, String nic, String address, String email, String phone,
			String username, String password) {
	
		this.id = id;
		this.name = name;
		this.bod = bod;
		this.nic = nic;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}
	
	//craete getters and setters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBod() {
		return bod;
	}
	public String getNic() {
		return nic;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
