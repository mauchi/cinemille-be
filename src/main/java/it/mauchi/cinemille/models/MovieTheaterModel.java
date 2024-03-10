package it.mauchi.cinemille.models;

import lombok.Data;

@Data
public class MovieTheaterModel {

	private Long id;
	private String name;
	private Short seats;
	private Boolean imax;

}
