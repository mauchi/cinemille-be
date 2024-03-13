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

import it.mauchi.cinemille.models.MovieTheaterModel;
import it.mauchi.cinemille.services.MovieTheaterService;

@CrossOrigin("http://localhost:4200")
@RestController
public class MovieTheaterController {

	@Autowired
	private MovieTheaterService movieTheaterService;

	@GetMapping("/movie-theaters")
	public List<MovieTheaterModel> getAllMovieTheaters(@RequestParam int pageNumber, @RequestParam int pageSize, @RequestParam String sortField, @RequestParam boolean desc) {
		return movieTheaterService.getAll(pageNumber, pageSize, sortField, desc);
	}

	@PutMapping("/movie-theater")
	public MovieTheaterModel saveMovieTheater(@RequestBody MovieTheaterModel m) {
		return movieTheaterService.save(m);
	}

	@DeleteMapping("/movie-theater/{id}")
	public void deleteMovieTheaterById(@PathVariable Long id) {
		movieTheaterService.delete(id);
	}

}
