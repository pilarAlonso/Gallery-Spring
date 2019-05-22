package com.prueba.demoprueba.Controllers;

import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Services.PainterService;
import com.prueba.demoprueba.Services.TechniqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PainterController {
	private final PainterService painterService;
	private final TechniqueService techniqueService;

	public PainterController(PainterService painterService, TechniqueService techniqueService) {
		this.painterService = painterService;
		this.techniqueService = techniqueService;

	}
	@GetMapping("/painters")

	public ResponseEntity<List<PainterModel>> findAll() {

		return ResponseEntity.ok(painterService.findAll());

	}



	@GetMapping("/painters/{id}")

	public ResponseEntity findOne(@PathVariable int id) {

		return ResponseEntity.ok(painterService.findOne(id));

	}



	@PostMapping("/painters")

	public ResponseEntity save(@Valid @RequestBody PainterModel painterModel) {

		return ResponseEntity.ok(painterService.save(painterModel));

	}



	@PutMapping("/painters/{id}")

	public ResponseEntity update(@Valid @RequestBody Painter painter, @PathVariable int id) {

		return ResponseEntity.ok(painterService.update(painter, id));

	}



	@DeleteMapping("/painters/{id}")

	public ResponseEntity delete(@PathVariable int id) {

		painterService.delete(id);

		return ResponseEntity.ok().build();

	}


}
