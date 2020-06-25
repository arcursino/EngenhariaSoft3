package model;

import java.util.Date;

// criar calculadora preço, fazer raça string mesmo

public abstract class Animal {
	private Raca raca;
	private String genero;
	private Date dataNascimento;
	private float quilos;
	private float arrobas;
	
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public float getQuilos() {
		return quilos;
	}
	public void setQuilos(float quilos) {
		this.quilos = quilos;
	}
	public float getArrobas() {
		return arrobas;
	}
	public void setArrobas(float arrobas) {
		this.arrobas = arrobas;
	}
	
	
}
