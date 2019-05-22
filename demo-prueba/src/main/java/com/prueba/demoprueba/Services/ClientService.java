package com.prueba.demoprueba.Services;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Models.ClientModel;
import com.prueba.demoprueba.Models.PainterModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
	List<ClientModel> findAll();
	Client findOne(int id);
	ClientModel  save(ClientModel clientModel);
	Client update(Client client, int id);
	void delete(int id);

}
