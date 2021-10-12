package com.duodigito.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	public void setResultado(double numero) {
		long tempoInicial = System.currentTimeMillis();
		int n = 2;
		this.resultado = menorDuoDigito(numero, n);
		this.tempo = System.currentTimeMillis() - tempoInicial;
	}
	public long getTempo() {
		return tempo;
	}
	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
	
	boolean isDuoDigit(double numero) {
		int conta = 0;
        List<Integer> intList = new ArrayList<Integer>();
        while (numero > 0) {
            intList.add((int) (numero % 10));
            numero = numero / 10;
            
        }
        Set<Integer> set = new HashSet<>(intList);
        intList.clear();
        intList.addAll(set);
        for(int b: intList) {
        	conta++;
        }
        if (conta > 2){
            return false;
        }
        return true;	
	}
	
	double menorDuoDigito(double numero, int n) {
		if(isDuoDigit(numero * n) == true) {
			return (numero * n);
		}
		else {
			n++;
			return menorDuoDigito(numero * n, n);
		}
	}
	
}
