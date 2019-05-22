package com.prueba.demoprueba.Services;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Entities.Picture;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Models.PictureModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PictureService {

	List<PictureModel> findAll();
	Picture findOne(int id);
	PictureModel  save(PictureModel picture);
	Picture update(Picture picture, int id);
	void delete(int id);

}
