package com.prueba.demoprueba.Services.impl;

import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Entities.Picture;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Models.PictureModel;
import com.prueba.demoprueba.Services.PictureService;
import com.prueba.demoprueba.repositories.PictureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PictureServiceImpl implements PictureService {
   private final PictureRepository pictureRepository;

	@Override
	public List<PictureModel> findAll() {
		return pictureRepository.findAll().stream().map(PictureModel::from).collect(Collectors.toList());
	}

	@Override
	public Picture findOne(int id) {
		return pictureRepository.findOne(id);
	}

	@Override
	public PictureModel save(PictureModel picture) {
		Picture newPicture = new Picture();

		newPicture.setPictureId(picture.getPictureId());
		newPicture.setTitle(picture.getTitle());
		newPicture.setPassword(picture.getPassword());
		newPicture.setDescription(picture.getDescription());
		newPicture.setPainterId(picture.getPainterId());

		return PictureModel.from(pictureRepository.save(newPicture));
	}

	@Override
	public Picture update(Picture picture, int id) {
		return pictureRepository.update(picture);
	}

	@Override
	public void delete(int id) {
		pictureRepository.delete(id);

	}

	public PictureServiceImpl(PictureRepository pictureRepository) {
		this.pictureRepository = pictureRepository;
	}


}
