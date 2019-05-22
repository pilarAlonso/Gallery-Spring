package com.prueba.demoprueba.Services;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Models.PainterModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PainterService {
	List<PainterModel> findAll();
	Painter findOne(int id);
	PainterModel  save(PainterModel painter);
	Painter update(Painter painter, int id);
	void delete(int id);


}
