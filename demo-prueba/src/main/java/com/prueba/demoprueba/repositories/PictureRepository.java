package com.prueba.demoprueba.repositories;

import com.prueba.demoprueba.Entities.Client;
import com.prueba.demoprueba.Entities.Painter;
import com.prueba.demoprueba.Entities.Picture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PictureRepository {
	private List<Picture> pictureList;
	private List<Client>clientList;
	public PictureRepository() {
		clientList=new ArrayList<>();

		pictureList=new ArrayList<>();
		pictureList.add(new Picture("cristo",1,"ddd",123.5,3,1,1,"1234"));
		pictureList.add(new Picture("cristo2",1,"ddd",123.5,3,2,2,"1234"));
		pictureList.add(new Picture("mona lisa",3,"ddd",13.5,3,3,3,"1234"));
		pictureList.add(new Picture("cristo",1,"ddd",3.5,3,3,4,"1234"));


	}



	public List<Picture> findAll() {

		return pictureList;

	}

	public Picture findOne(int id) {
		return pictureList.stream()

						  .filter(p -> p.getPictureId() == id)

						  .findFirst()

						  .get();

	}


	public Picture update(Picture picture) {
		Picture oldPicture = pictureList.stream()

										.filter(p -> p.getPictureId() == picture.getPictureId())

										.findFirst()

										.get();



		oldPicture.setTitle(picture.getTitle());



		return picture;

	}

	public void delete(int id) {
		pictureList.removeIf(p -> p.getPictureId() == id);
	}

	public Picture save(Picture newPicture) {
		pictureList.add(newPicture);

		return newPicture;
	}
}
