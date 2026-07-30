package com.example.serialization;

import java.io.Serializable;

public class Account implements Serializable
{
    public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcId() {
		return acId;
	}

	public void setAcId(String acId) {
		this.acId = acId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private int balance;
    private String name;
    private String acId;
    private String address;
    
	public Account(int balance, String name, String acId, String address) {
		super();
		this.balance = balance;
		this.name = name;
		this.acId = acId;
		this.address = address;
	}
    
    
    
    
	
}
