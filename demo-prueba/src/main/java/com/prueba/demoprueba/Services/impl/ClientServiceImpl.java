package com.prueba.demoprueba.Services.impl;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Models.ClientModel;
import com.prueba.demoprueba.Models.PainterModel;
import com.prueba.demoprueba.Services.ClientService;
import com.prueba.demoprueba.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
 public class ClientServiceImpl implements ClientService {
	private final ClientRepository clientRepository;

	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public List<ClientModel> findAll() {

			return clientRepository.findAll().stream().map(ClientModel::from).collect(Collectors.toList());
		}



	@Override
	public Client findOne(int id) {
		return clientRepository.findOne(id);
	}

	@Override
	public ClientModel save(ClientModel client) {
		Client newClient = new Client();

		newClient.setIdClient(client.getIdClient());

		newClient.setName(client.getName());

		newClient.setPassword(client.getPassword());
		newClient.setAddress(client.getAddress());

		return ClientModel.from(clientRepository.save(newClient));
	}

	@Override
	public Client update(Client client, int id) {
		return clientRepository.update(client);
	}

	@Override
	public void delete(int id) {
		clientRepository.delete(id);

	}

}


