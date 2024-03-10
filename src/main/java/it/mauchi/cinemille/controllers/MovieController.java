package it.mauchi.cinemille.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mauchi.cinemille.models.MovieModel;
import it.mauchi.cinemille.services.MovieService;

@RestController("movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping
	public List<MovieModel> getAll(int pageNumber, int pageSize, String sortField, boolean desc) {
		return movieService.getAll(pageNumber, pageSize, sortField, desc);
	}

	@PutMapping
	public MovieModel save(MovieModel m) {
		return movieService.save(m);
	}

	@DeleteMapping
	public void delete(Long id) {
		movieService.delete(id);
	}

}
