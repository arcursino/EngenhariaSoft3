package model;

public class VacinaBuilder {
	private Vacina vacina;
	
	public VacinaBuilder () {
		
	}
	
	public VacinaBuilder IniciarVacinaBovino() {
		vacina = new VacinaBovino();
		return this;
	}
	
	public VacinaBuilder IniciarVacinaSuino() {
		vacina = new VacinaSuino();
		return this;
	}
	
	public VacinaBuilder nomeVacina (String nomeVacina) {
		vacina.setNomeVacina(nomeVacina);
		return this;
	}
	
	public VacinaBuilder frequencia (int frequencia) {
		vacina.setFrequencia(frequencia);
		return this;
	}	
	
	public Vacina criar() {
		return vacina;
	}

}
