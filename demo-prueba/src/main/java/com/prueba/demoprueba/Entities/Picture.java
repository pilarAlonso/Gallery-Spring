package com.prueba.demoprueba.Entities;

public class Picture {
	private String title;
	private int pictureId;
	private int painterId;
	private String description;
	private double price;
	private int stock;
	private int techniqueId;
	private String password;

	public Picture() {
	}

	public Picture(String title, int painterId, String description, double price, int stock, int techniqueId, int pictureId, String password) {
		this.title = title;
		this.painterId=painterId;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.techniqueId = techniqueId;
		this.pictureId=pictureId;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPainterId() {
		return painterId;
	}

	public void setPainterId(int painterId) {
		this.painterId = painterId;
	}

	public int getTechniqueId() {
		return techniqueId;
	}

	public void setTechniqueId(int techniqueId) {
		this.techniqueId = techniqueId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}




}
