package it.mauchi.cinemille.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MovieTheater {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Short seats;
	private Boolean imax;
	
}
