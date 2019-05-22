package com.prueba.demoprueba.repositories;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Entities.Picture;
import com.prueba.demoprueba.Entities.Technique;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PainterRepository {
	private List<Painter> painterList;
	private List<Client> followerList;
	private List<Client> clientList;
	private List<Picture> paintedPicturesList;
	private List<Technique> techniqueList;

	public PainterRepository() {
		painterList = new ArrayList<>();

		painterList.add(new Painter(1, "salvador", "1234"));
		painterList.add(new Painter(2, "ernst",  "1234"));
		painterList.add(new Painter(3, "humdt",  "1234"));
		painterList.add(new Painter(4, "huxley",  "1234"));

	}

	public Painter findOne(int id) {

		return painterList.stream()

			.filter(p -> p.getId() == id)

			.findFirst()

						  .get();

}

	public List<Painter> findAll() {

		return painterList;

	}

	public Painter save(Painter painter) {

		painterList.add(painter);

		return painter;

	}

	public Painter update(Painter painter) {

		Painter oldPainter = painterList.stream()

									 .filter(p -> p.getId() == painter.getId())

									 .findFirst()

									 .get();



		oldPainter.setName(painter.getName());



		return painter;

	}
	public void delete(int id) {

		painterList.removeIf(p -> p.getId() == id);

	}
}
