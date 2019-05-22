package com.prueba.demoprueba.repositories;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Technique;
import com.prueba.demoprueba.Models.TechniqueModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TechniqueRepository{
	List<Technique> techniqueList;
	public TechniqueRepository(){
		techniqueList=new ArrayList<>();
		techniqueList.add(new Technique("oleo",1,"1234"));
		techniqueList.add(new Technique("charcoal",2,"1234"));
	}

	public List<Technique> findAll() {
		return techniqueList;
	}

	public Technique findOne(int id) {
		return techniqueList.stream()

						.filter(p -> p.getIdTech() == id)

						.findFirst()

						.get();
	}

	public void delete(int id) {
		techniqueList.removeIf(p -> p.getIdTech() == id);
	}

	public Technique update(Technique technique) {
		Technique oldTechnique = techniqueList.stream()

									.filter(p -> p.getIdTech()== technique.getIdTech())

									.findFirst()

									.get();



		oldTechnique.setTipo(technique.getTipo());



		return technique;

	}

	public Technique save(Technique newTechnique) {
		techniqueList.add(newTechnique);

		return newTechnique;
	}
}

