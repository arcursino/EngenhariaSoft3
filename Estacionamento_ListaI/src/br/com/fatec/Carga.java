package br.com.fatec;

public class Carga extends Veiculo {
	
//	private double valor = 4.0;

	public Carga(double tempo, double eixo) {
		super(tempo);
		this.valor = 4*eixo;
	}
	

}
