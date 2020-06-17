package model;

public class RacaBuilder {
	private Raca raca;
	
	public RacaBuilder() {
//		raca = new RacaBovino();
	}
	public RacaBuilder IniciarBovino() {
		raca = new RacaBovino();
		return this;
	}
	public RacaBuilder IniciarSuino() {
		raca = new RacaSuino();
		return this;
	}
	
	public RacaBuilder nome (String nome) {
		raca.setNome(nome);
		return this;
	}
	
	public RacaBuilder valorQuilos(float valor) {
		raca.setValorQuilos(valor);
		raca.setValorArrobas(valor*30);
		return this;
	}
	
	public RacaBuilder valorArrobas(float valor) {
		raca.setValorArrobas(valor);
		raca.setValorQuilos(valor/30);
		return this;
	}
	
	public Raca criar() {
		return raca;
	}
}
