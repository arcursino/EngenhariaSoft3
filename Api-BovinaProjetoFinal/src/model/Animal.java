package model;

import java.util.Date;

// criar calculadora preço, fazer raça string mesmo

public abstract class Animal {	
	private Raca raca;
	private String genero;
	private Date dataNasc;
	private CreateId id;
	private CarteiraVacina vacina;
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
	
	public Date getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public CreateId getId() {
		return id;
	}
	
	public void setId(CreateId id) {
		this.id = id;
	}
	
	public CarteiraVacina getVacina() {
		return vacina;
	}
	
	public void setVacina(CarteiraVacina vacina) {
		this.vacina = vacina;
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
