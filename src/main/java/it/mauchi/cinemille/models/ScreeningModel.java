package it.mauchi.cinemille.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ScreeningModel {

	private Long id;
	private MovieModel movie;
	private MovieTheaterModel movieTheater;
	private LocalDate startDate;
	private LocalDate endDate;

}
