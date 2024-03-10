package it.mauchi.cinemille.mappers;

import it.mauchi.cinemille.entities.Screening;
import it.mauchi.cinemille.models.ScreeningModel;

public class ScreeningMapper {

	public static ScreeningModel fromEntityToModel(Screening e) {
		ScreeningModel m = new ScreeningModel();
		m.setId(e.getId());
		m.setMovie(e.getMovie());
		m.setMovieTheater(e.getMovieTheater());
		m.setStartDate(e.getStartDate());
		m.setEndDate(e.getEndDate());
		return m;
	}

	public static Screening fromModelToEntity(ScreeningModel m) {
		Screening e = new Screening();
		e.setId(m.getId());
		e.setMovie(m.getMovie());
		e.setMovieTheater(m.getMovieTheater());
		e.setStartDate(m.getStartDate());
		e.setEndDate(m.getEndDate());
		return e;
	}

}
