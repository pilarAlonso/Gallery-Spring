package com.prueba.demoprueba.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;

public class ClientModel {
	private int idClient;
	private String name;
	private String address;
	private String password;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)


	public static ClientModel from(Client client) {

		ClientModel clientModel = new ClientModel();

		clientModel.setIdClient(client.getIdClient());

		clientModel.setName(client.getName());
		clientModel.setAddress(client.getAddress());

		clientModel.setPassword(client.getPassword());

		return clientModel;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
