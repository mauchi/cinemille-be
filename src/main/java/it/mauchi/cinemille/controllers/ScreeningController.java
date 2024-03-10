package it.mauchi.cinemille.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mauchi.cinemille.models.ScreeningModel;
import it.mauchi.cinemille.services.ScreeningService;

@RestController("screenings")
public class ScreeningController {

	@Autowired
	private ScreeningService screeningService;

	@GetMapping
	public List<ScreeningModel> getAll(int pageNumber, int pageSize, String sortField, boolean desc) {
		return screeningService.getAll(pageNumber, pageSize, sortField, desc);
	}

	@PutMapping
	public ScreeningModel save(ScreeningModel m) {
		return screeningService.save(m);
	}

	@DeleteMapping
	public void delete(Long id) {
		screeningService.delete(id);
	}

}
