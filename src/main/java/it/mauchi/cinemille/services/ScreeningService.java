package it.mauchi.cinemille.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import it.mauchi.cinemille.entities.Screening;
import it.mauchi.cinemille.mappers.ScreeningMapper;
import it.mauchi.cinemille.models.ScreeningModel;
import it.mauchi.cinemille.repositories.ScreeningRepository;

@Service
public class ScreeningService {

	@Autowired
	private ScreeningRepository screeningRepository;

	public List<ScreeningModel> getAll(int pageNumber, int pageSize, String sortField, boolean desc) {
		Sort sort = Sort.by(sortField);
		return screeningRepository.findAll(PageRequest.of(pageNumber, pageSize, desc ? sort.descending() : sort)).get()
				.map(e -> ScreeningMapper.fromEntityToModel(e)).toList();
	}

	public ScreeningModel save(ScreeningModel m) {
		Screening e = screeningRepository.save(ScreeningMapper.fromModelToEntity(m));
		return ScreeningMapper.fromEntityToModel(e);
	}

	public void delete(Long id) {
		screeningRepository.deleteById(id);
	}

}
