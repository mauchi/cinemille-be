package it.mauchi.cinemille.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mauchi.cinemille.models.MovieTheaterModel;
import it.mauchi.cinemille.services.MovieTheaterService;

@RestController("movie-theaters")
public class MovieTheaterController {

	@Autowired
	private MovieTheaterService movieTheaterService;

	@GetMapping
	public List<MovieTheaterModel> getAll(int pageNumber, int pageSize, String sortField, boolean desc) {
		return movieTheaterService.getAll(pageNumber, pageSize, sortField, desc);
	}

	@PutMapping
	public MovieTheaterModel save(MovieTheaterModel m) {
		return movieTheaterService.save(m);
	}

	@DeleteMapping
	public void delete(Long id) {
		movieTheaterService.delete(id);
	}

}
