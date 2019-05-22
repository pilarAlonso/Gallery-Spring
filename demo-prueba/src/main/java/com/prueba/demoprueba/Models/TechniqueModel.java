package com.prueba.demoprueba.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Technique;

public class TechniqueModel {
	private String tipo;
	private int idTech;
	private String password;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdTech() {
		return idTech;
	}

	public void setIdTech(int idTech) {
		this.idTech = idTech;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)


	public static TechniqueModel from(Technique technique) {

		TechniqueModel techniqueModel = new TechniqueModel();

		techniqueModel.setIdTech(technique.getIdTech());

		techniqueModel.setPassword(technique.getPassword());
		techniqueModel.setTipo(technique.getTipo());



		return techniqueModel;

	}


}
