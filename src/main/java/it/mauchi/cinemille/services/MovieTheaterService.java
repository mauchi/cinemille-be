package it.mauchi.cinemille.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import it.mauchi.cinemille.entities.MovieTheater;
import it.mauchi.cinemille.mappers.MovieTheaterMapper;
import it.mauchi.cinemille.models.MovieTheaterModel;
import it.mauchi.cinemille.repositories.MovieTheaterRepository;

@Service
public class MovieTheaterService {

	@Autowired
	private MovieTheaterRepository movieTheaterRepository;

	public List<MovieTheaterModel> getAll(int pageNumber, int pageSize, String sortField, boolean desc) {
		Sort sort = Sort.by(sortField);
		return movieTheaterRepository.findAll(PageRequest.of(pageNumber, pageSize, desc ? sort.descending() : sort))
				.get().map(e -> MovieTheaterMapper.fromEntityToModel(e)).toList();
	}

	public MovieTheaterModel save(MovieTheaterModel m) {
		MovieTheater e = movieTheaterRepository.save(MovieTheaterMapper.fromModelToEntity(m));
		return MovieTheaterMapper.fromEntityToModel(e);
	}

	public void delete(Long id) {
		movieTheaterRepository.deleteById(id);
	}

}
