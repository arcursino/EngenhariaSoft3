package model;

import java.util.Date;

public class CVSBuilder {
	private CarteiraVacina carteira;
	
	public CVSBuilder IniciarCarteira() {
		carteira = new CarteiraVacinaSuino();
		return this;
	}

	public CVSBuilder Pneumonia(Date data) {
		Vacina vacina = new Vacina("Pneumonia",data);
		carteira.setPneumonia(vacina);
		return this;
	}
	public CVSBuilder Glasser(Date data) {
		Vacina vacina = new Vacina("Glasser",data);
		carteira.setGlasser(vacina);
		return this;
	}
	public CVSBuilder Rotavirus(Date data) {
		Vacina vacina = new Vacina("Rotavirus",data);
		carteira.setRotavirus(vacina);
		return this;
	}
	public CVSBuilder Rinite(Date data) {
		Vacina vacina = new Vacina("Rinite",data);
		carteira.setRinite(vacina);
		return this;
	}
	
	public CarteiraVacinaSuino Criar() {
		return (CarteiraVacinaSuino) carteira;
	}
}
