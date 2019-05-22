package com.prueba.demoprueba.Entities;

import com.sun.javafx.beans.IDProperty;

public class Technique {
	private String tipo;
	private int idTech;
	private String password;

	public Technique(String tipo, int idTech,String password) {
		this.tipo = tipo;
		this.idTech = idTech;
		this.password=password;
	}

	public Technique() {
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
}
