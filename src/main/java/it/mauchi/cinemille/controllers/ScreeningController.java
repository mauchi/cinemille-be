package it.mauchi.cinemille.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.mauchi.cinemille.models.ScreeningModel;
import it.mauchi.cinemille.services.ScreeningService;

@RestController
public class ScreeningController {

	@Autowired
	private ScreeningService screeningService;

	@GetMapping("/screenings")
	public List<ScreeningModel> getAll(@RequestParam int pageNumber, @RequestParam int pageSize,
			@RequestParam String sortField, @RequestParam boolean desc) {
		return screeningService.getAll(pageNumber, pageSize, sortField, desc);
	}

	@PutMapping("/screening")
	public ScreeningModel save(@RequestBody ScreeningModel m) {
		return screeningService.save(m);
	}

	@DeleteMapping("/screening/{id}")
	public void delete(@RequestParam Long id) {
		screeningService.delete(id);
	}

}
