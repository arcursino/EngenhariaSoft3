package br.com.fatec;

public class ValorMensal implements CalculoValor {

	private final double MES = 2592E6;
	private double valorParaCalculo;

	public ValorMensal(double valor) {
		this.valorParaCalculo = valor;
	}

	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		return valorParaCalculo * Math.ceil(tempo / MES)*valor();
	}

	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return 600;
	}
}
