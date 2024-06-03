package com.olabi.olabiflix.controller;

import com.olabi.olabiflix.model.entity.Serie;
import com.olabi.olabiflix.repository.SerieRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class SerieController {
    private final SerieRepository serieRepository;

    public SerieController(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @GetMapping("/series")
	public List<Serie> getSeries(){

		return serieRepository.findAll();

	}

}
