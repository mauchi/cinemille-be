package it.mauchi.cinemille.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Screening {

	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Movie movie;
	@ManyToOne
	private MovieTheater movieTheater;
	private LocalDate startDate;
	private LocalDate endDate;

}
