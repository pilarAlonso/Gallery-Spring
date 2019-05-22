package com.prueba.demoprueba.Services.impl;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Technique;
import com.prueba.demoprueba.Models.ClientModel;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Models.TechniqueModel;
import com.prueba.demoprueba.Services.TechniqueService;
import com.prueba.demoprueba.repositories.TechniqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TechniqueServiceImpl implements TechniqueService {
private final TechniqueRepository techniqueRepository;

	public TechniqueServiceImpl(TechniqueRepository techniqueRepository) {
		this.techniqueRepository = techniqueRepository;
	}

	@Override
	public List<TechniqueModel> findAll() {
		return techniqueRepository.findAll().stream().map(TechniqueModel::from).collect(Collectors.toList());
	};


	@Override
	public Technique findOne(int id) {
		return techniqueRepository.findOne(id);
	}

	@Override
	public TechniqueModel save(TechniqueModel technique) {
		Technique newTechnique = new Technique();

		newTechnique.setIdTech(technique.getIdTech());

		newTechnique.setTipo(technique.getTipo());

		newTechnique.setPassword(technique.getPassword());


		return TechniqueModel.from(techniqueRepository.save(newTechnique));
	}


	@Override
	public Technique update(Technique technique, int id) {
		return techniqueRepository.update(technique);
	}

	@Override
	public void delete(int id) {
		techniqueRepository.delete(id);

	}
}
