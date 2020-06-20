package model;

import java.util.Date;

public class DosagemBuilder {
	private Dosagem dosagem;
	
	public DosagemBuilder () {
		
	}	
		
	public DosagemBuilder IniciarDosagemBovino() {
		dosagem = new DosagemBovino();
		return this;
	}
	
	public DosagemBuilder IniciarDosagemSuino() {
		dosagem = new DosagemSuino();
		return this;
	}
	
	public DosagemBuilder Vacina(Vacina vacina) {
		dosagem.setVacina(vacina);
		return this;
	}
		
	public DosagemBuilder dataVacina (Date dataVacina) {
		dosagem.setDataVacina(dataVacina);
		return this;
	}
	
	public Dosagem criar() {
		return dosagem;
	}

}
