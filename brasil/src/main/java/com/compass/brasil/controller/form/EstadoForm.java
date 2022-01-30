package com.compass.brasil.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.compass.brasil.modelo.Estado;
import com.compass.brasil.repository.EstadoRepository;

public class EstadoForm {
	
	@NotNull @NotEmpty @Length(min = 4)
	private String nome;
	@NotNull @NotEmpty 
	private String regiao;
	@NotNull @NotEmpty
	private long populacao;
	@NotNull @NotEmpty
	private String capital;
	@NotNull @NotEmpty
	private double area;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public Estado converter(EstadoRepository estadoRepository){
		return new Estado();
	}
	public Estado atualizar(Long id, EstadoRepository estadoRepository) {
		return new Estado();
	}
	
	
}


