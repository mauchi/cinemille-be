package it.mauchi.cinemille.mappers;

import it.mauchi.cinemille.entities.MovieTheater;
import it.mauchi.cinemille.models.MovieTheaterModel;

public class MovieTheaterMapper {

	public static MovieTheaterModel fromEntityToModel(MovieTheater e) {
		MovieTheaterModel m = new MovieTheaterModel();
		m.setId(e.getId());
		m.setName(e.getName());
		m.setSeats(e.getSeats());
		m.setImax(e.getImax());
		return m;
	}

	public static MovieTheater fromModelToEntity(MovieTheaterModel m) {
		MovieTheater e = new MovieTheater();
		e.setId(m.getId());
		e.setName(m.getName());
		e.setSeats(m.getSeats());
		e.setImax(m.getImax());
		return e;
	}

}
