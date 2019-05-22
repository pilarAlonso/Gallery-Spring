package com.prueba.demoprueba.repositories;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {
	private List<Client> clientLis;
	public ClientRepository() {

		clientLis = new ArrayList<>();
		clientLis.add(new Client(1,"paco","calle roto","1234"));
		clientLis.add(new Client(2,"pedro","calle dos","1234"));
		clientLis.add(new Client(3,"roberto","calle tres","1234"));

	}



	public List<Client> findAll() {

		return clientLis;

	}

	public Client findOne(int id) {
		return clientLis.stream()

						  .filter(p -> p.getIdClient() == id)

						  .findFirst()

						  .get();

	}

	public void delete(int id) {
		clientLis.removeIf(p -> p.getIdClient() == id);
	}

	public Client update(Client client) {
		Client oldClient = clientLis.stream()

										.filter(p -> p.getIdClient() == client.getIdClient())

										.findFirst()

										.get();



		oldClient.setName(client.getName());



		return client;

	}

	public Client save(Client newClient) {
		clientLis.add(newClient);

		return newClient;
	}
}
