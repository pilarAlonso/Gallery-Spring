package com.prueba.demoprueba.Services.impl;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Services.PainterService;
import com.prueba.demoprueba.repositories.ClientRepository;
import com.prueba.demoprueba.repositories.PainterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PainterServiceImpl implements PainterService {
	private final PainterRepository painterRepository;


	public PainterServiceImpl(PainterRepository painterRepository) {
		this.painterRepository = painterRepository;

	}

	@Override
	public Painter findOne(int id) {
		return painterRepository.findOne(id);
	}

	@Override
	public PainterModel save(PainterModel painter) {
		Painter newPainter = new Painter();

		newPainter.setId(painter.getId());

		newPainter.setName(painter.getName());

		newPainter.setPassword(painter.getPassword());

		return PainterModel.from(painterRepository.save(newPainter));


	}

	@Override
	public Painter update(Painter painter, int id) {
		return painterRepository.update(painter);
	}

	@Override
	public void delete(int id) {
		painterRepository.delete(id);

	}



	@Override
	public List<PainterModel> findAll() {
		return painterRepository.findAll().stream().map(PainterModel::from).collect(Collectors.toList());
	}


}
