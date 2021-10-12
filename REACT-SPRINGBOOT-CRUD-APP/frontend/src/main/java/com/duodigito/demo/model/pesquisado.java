package com.duodigito.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pesquisado")
public class pesquisado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Pesquisa")
	private double input;
	
	@Column(name = "Resultado")
	private double resultado;
	
	@Column(name = "Tempo")
	private long tempo;
	
	public pesquisado() {
		
	}
	
	public pesquisado(double input, double resultado, long tempo) {
		super();
		this.input = input;
		this.resultado = resultado;
		this.tempo = tempo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getInput() {
		return input;
	}
	public void setInput(double input) {
		this.input = input;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public long getTempo() {
		return tempo;
	}
	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
	
}
