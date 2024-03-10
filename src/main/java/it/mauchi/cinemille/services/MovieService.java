package it.mauchi.cinemille.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import it.mauchi.cinemille.entities.Movie;
import it.mauchi.cinemille.mappers.MovieMapper;
import it.mauchi.cinemille.models.MovieModel;
import it.mauchi.cinemille.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<MovieModel> getAll(int pageNumber, int pageSize, String sortField, boolean desc) {
		Sort sort = Sort.by(sortField);
		return movieRepository.findAll(PageRequest.of(pageNumber, pageSize, desc ? sort.descending() : sort)).get()
				.map(e -> MovieMapper.fromEntityToModel(e)).toList();
	}

	public MovieModel save(MovieModel m) {
		Movie e = movieRepository.save(MovieMapper.fromModelToEntity(m));
		return MovieMapper.fromEntityToModel(e);
	}

	public void delete(Long id) {
		movieRepository.deleteById(id);
	}

}
