package com.prueba.demoprueba.Services;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Technique;
import com.prueba.demoprueba.Models.ClientModel;
import com.prueba.demoprueba.Models.TechniqueModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TechniqueService {
	List<TechniqueModel> findAll();
	Technique findOne(int id);
	TechniqueModel  save(TechniqueModel techniqueModel);
	Technique update(Technique technique, int id);
	void delete(int id);



}
