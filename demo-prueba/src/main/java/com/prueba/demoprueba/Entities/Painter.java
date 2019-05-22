package com.prueba.demoprueba.Entities;

public class Painter {
	private int id;
	private String name;
	private int techniqueId;
	private String password;

	public Painter(int id, String name,String password) {
		this.id = id;
		this.name= name;
		this.password=password;

	}

	public void setTechniqueId(int techniqueId) {
		this.techniqueId = techniqueId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTechniqueId() {
		return techniqueId;
	}

	public String getPassword() {
		return password;
	}

	public Painter() {
	}

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
}
