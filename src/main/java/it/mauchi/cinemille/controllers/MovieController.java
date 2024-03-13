package it.mauchi.cinemille.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.mauchi.cinemille.models.MovieModel;
import it.mauchi.cinemille.services.MovieService;

@CrossOrigin("http://localhost:4200")
@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/movies")
	public List<MovieModel> getAllMovies(@RequestParam int pageNumber, @RequestParam int pageSize,
			@RequestParam String sortField, @RequestParam boolean desc) {
		return movieService.getAll(pageNumber, pageSize, sortField, desc);
	}

	@PutMapping("/movie")
	public MovieModel saveMovie(@RequestBody MovieModel m) {
		return movieService.save(m);
	}

	@DeleteMapping("/movie/{id}")
	public void deleteMovieById(@PathVariable Long id) {
		movieService.delete(id);
	}

}
