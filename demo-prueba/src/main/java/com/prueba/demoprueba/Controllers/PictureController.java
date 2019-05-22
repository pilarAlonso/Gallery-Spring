package com.prueba.demoprueba.Controllers;

import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Entities.Picture;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Models.PictureModel;
import com.prueba.demoprueba.Services.PictureService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PictureController {
	private final PictureService pictureService;

	public PictureController(PictureService pictureService) {
		this.pictureService = pictureService;
	}
	@GetMapping("/pictures")

	public ResponseEntity<List<PictureModel>> findAll() {

		return ResponseEntity.ok(pictureService.findAll());

	}



	@GetMapping("/pictures/{id}")

	public ResponseEntity findOne(@PathVariable int id) {

		return ResponseEntity.ok(pictureService.findOne(id));

	}



	@PostMapping("/pictures")

	public ResponseEntity save(@Valid @RequestBody PictureModel pictureModel) {

		return ResponseEntity.ok(pictureService.save(pictureModel));

	}



	@PutMapping("/pictures/{id}")

	public ResponseEntity update(@Valid @RequestBody Picture picture, @PathVariable int id) {

		return ResponseEntity.ok(pictureService.update(picture, id));

	}



	@DeleteMapping("/pictures/{id}")

	public ResponseEntity delete(@PathVariable int id) {

		pictureService.delete(id);

		return ResponseEntity.ok().build();

	}

}
