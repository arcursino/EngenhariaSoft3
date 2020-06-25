package model;

import java.util.Date;

public class CVBBuilder {
	private CarteiraVacina carteira;
	
	public CVBBuilder IniciarCarteira() {
		carteira = new CarteiraVacinaBovino();
		return this;
	}

	public CVBBuilder Raiva(Date data) {
		Vacina vacina = new Vacina("Raiva",data);
		carteira.setRaiva(vacina);
		return this;
	}
	public CVBBuilder Carbunculo(Date data) {
		Vacina vacina = new Vacina("Carbunculo",data);
		carteira.setCarbunculo(vacina);
		return this;
	}
	public CVBBuilder Brucelose(Date data) {
		Vacina vacina = new Vacina("Brucelose",data);
		carteira.setBrucelose(vacina);
		return this;
	}
	public CVBBuilder Aftosa(Date data) {
		Vacina vacina = new Vacina("Aftosa",data);
		carteira.setAftosa(vacina);
		return this;
	}
	public CarteiraVacinaBovino Criar() {
		return (CarteiraVacinaBovino) carteira;
	}
}
