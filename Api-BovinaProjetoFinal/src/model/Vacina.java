package model;

import java.util.Date;

public class Vacina {
	private String nomeVacina;
	private Date data;
	
	public Vacina(String nomeVacina, Date data) {
		super();
		this.nomeVacina = nomeVacina;
		this.data = data;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
