package com.prueba.demoprueba.Controllers;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Models.ClientModel;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ClientController {
	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	@GetMapping("/clients")

	public ResponseEntity<List<ClientModel>> findAll() {

		return ResponseEntity.ok(clientService.findAll());

	}



	@GetMapping("/clients/{id}")

	public ResponseEntity findOne(@PathVariable int id) {

		return ResponseEntity.ok(clientService.findOne(id));

	}



	@PostMapping("/clients")

	public ResponseEntity save(@Valid @RequestBody ClientModel clientModel) {

		return ResponseEntity.ok(clientService.save(clientModel));

	}



	@PutMapping("/clients/{id}")

	public ResponseEntity update(@Valid @RequestBody Client client, @PathVariable int id) {

		return ResponseEntity.ok(clientService.update(client, id));

	}



	@DeleteMapping("/clients/{id}")

	public ResponseEntity delete(@PathVariable int id) {

		clientService.delete(id);

		return ResponseEntity.ok().build();

	}

}
