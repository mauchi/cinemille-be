package it.mauchi.cinemille.models;

import java.time.LocalDate;

import it.mauchi.cinemille.entities.Movie;
import it.mauchi.cinemille.entities.MovieTheater;
import lombok.Data;

@Data
public class ScreeningModel {

	private Long id;
	private Movie movie;
	private MovieTheater movieTheater;
	private LocalDate startDate;
	private LocalDate endDate;

}
