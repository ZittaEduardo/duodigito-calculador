package com.duodigito.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duodigito.demo.model.pesquisado;
import com.duodigito.demo.repository.RepositorioPesquisa;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PesquisadoController {

	@Autowired
	private RepositorioPesquisa RepositorioPesquisa;
	
	//Pega todas pesquisas
	@GetMapping("/pesquisados")
	public List<pesquisado> getAllPesquisados(){
		return RepositorioPesquisa.findAll();
	}
	
	//Cria pesquisa REST API
	@PostMapping("/pesquisados")
	public pesquisado createPesquisado(@RequestBody pesquisado pesquisado) {
		long numero = pesquisado.getInput();
		pesquisado.setResultado(numero);
		pesquisado pesquisador = pesquisado;
		return RepositorioPesquisa.save(pesquisador);
	}
	
}
