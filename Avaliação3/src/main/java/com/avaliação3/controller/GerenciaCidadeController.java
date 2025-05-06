package com.avaliação3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliação3.service.GerenciaCidadeService;

@RestController
@RequestMapping("/GerenciaCidade")
public class GerenciaCidadeController {

	private final GerenciaCidadeService gerenciaCidadeService;

	public GerenciaCidadeController (GerenciaCidadeService gerenciaCidadeService) {
		this.gerenciaCidadeService = gerenciaCidadeService;
	}

	@GetMapping("/{id}")
	public GerenciaCidadeController <GerenciaCidade>(@PathVariable,Long id )




}