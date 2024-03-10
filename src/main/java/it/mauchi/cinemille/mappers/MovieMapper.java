package it.mauchi.cinemille.mappers;

import it.mauchi.cinemille.entities.Movie;
import it.mauchi.cinemille.models.MovieModel;

public class MovieMapper {

	public static MovieModel fromEntityToModel(Movie e) {
		MovieModel m = new MovieModel();
		m.setId(e.getId());
		m.setTitle(e.getTitle());
		m.setGenre(e.getGenre());
		m.setAuthor(e.getAuthor());
		return m;
	}

	public static Movie fromModelToEntity(MovieModel m) {
		Movie e = new Movie();
		e.setId(m.getId());
		e.setTitle(m.getTitle());
		e.setGenre(m.getGenre());
		e.setAuthor(m.getAuthor());
		return e;
	}

}
