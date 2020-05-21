package br.com.fatec;

public class ValorHora implements CalculoValor {

	private final double HORA = 3600000;
	private double valorParaCalculo;

	public ValorHora(double valor) {
		this.valorParaCalculo = valor;
	}

	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		return valorParaCalculo * Math.ceil(tempo / HORA) * valor() ;
	}

	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return 1;
	}
}