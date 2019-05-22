package com.prueba.demoprueba.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Entities.Picture;

public class PictureModel {
	private String title;
	private int pictureId;
	private int painterId;
	private String description;
	private double price;
	private int stock;
	private int techniqueId;
	private String password;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)



	public static PictureModel from(Picture picture) {

		PictureModel pictureModel = new PictureModel();

		pictureModel.setPictureId(picture.getPictureId());
		pictureModel.setDescription(picture.getDescription());
		pictureModel.setPainterId(picture.getPainterId());
		pictureModel.setPrice(picture.getPrice());
		pictureModel.setTitle(picture.getTitle());
		pictureModel.setPassword(picture.getPassword());
		pictureModel.setStock(picture.getStock());
		pictureModel.setTechniqueId(picture.getTechniqueId());

		return pictureModel;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	public int getPainterId() {
		return painterId;
	}

	public void setPainterId(int painterId) {
		this.painterId = painterId;
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

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getTechniqueId() {
		return techniqueId;
	}

	public void setTechniqueId(int techniqueId) {
		this.techniqueId = techniqueId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
