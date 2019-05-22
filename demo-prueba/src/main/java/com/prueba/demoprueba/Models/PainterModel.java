package com.prueba.demoprueba.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.prueba.demoprueba.Entities.Painter;

public class PainterModel {
	private int id;
	private String name;
	private int techniqueId;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTechniqueId() {
		return techniqueId;
	}

	public void setTechniqueId(int techniqueId) {
		this.techniqueId = techniqueId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static PainterModel from(Painter painter) {

		PainterModel painterModel = new PainterModel();

		painterModel.setId(painter.getId());

		painterModel.setName(painter.getName());

		painterModel.setPassword(painter.getPassword());

		return painterModel;

	}

	public String getPassword() {
		return password;
	}

	public PainterModel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}





}
