package com.prueba.demoprueba.Controllers;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Technique;
import com.prueba.demoprueba.Models.ClientModel;
import com.prueba.demoprueba.Models.TechniqueModel;
import com.prueba.demoprueba.Services.TechniqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class TechniqueController {
	private final TechniqueService techniqueService;

	public TechniqueController(TechniqueService techniqueService) {
		this.techniqueService = techniqueService;
	}
	@GetMapping("/techniques/{id}")

	public ResponseEntity findOne(@PathVariable int id) {

		return ResponseEntity.ok(techniqueService.findOne(id));

	}



	@PostMapping("/techniques")

	public ResponseEntity save(@Valid @RequestBody TechniqueModel techniqueModel) {

		return ResponseEntity.ok(techniqueService.save(techniqueModel));

	}



	@PutMapping("/techniques/{id}")

	public ResponseEntity update(@Valid @RequestBody Technique technique, @PathVariable int id) {

		return ResponseEntity.ok(techniqueService.update(technique, id));

	}



	@DeleteMapping("/techniques/{id}")

	public ResponseEntity delete(@PathVariable int id) {

	techniqueService.delete(id);

		return ResponseEntity.ok().build();

	}

}
