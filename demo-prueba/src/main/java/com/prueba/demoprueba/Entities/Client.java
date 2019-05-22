package com.prueba.demoprueba.Entities;

import java.util.List;

public class Client {
	private int idClient;
	private String name;
	private String address;
	private String password;



	public Client(int idClient, String name, String address,String password) {
		this.idClient = idClient;
		this.name = name;
		this.address = address;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Client() {
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
