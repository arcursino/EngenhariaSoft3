package br.com.fatec;

public class ValorDiaria implements CalculoValor {

	private final double DIA = 86400000;
	private double valorParaCalculo;
//	private Veiculo veiculo;
//	private double Tempo;

	public ValorDiaria(double valor) {
		this.valorParaCalculo = valor;
	}

	
	
	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		double  v = valorParaCalculo * Math.ceil(tempo / DIA)*valor();
		return v;
	}



	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return 24;
	}
	
	
	
//	@Override
//	public double valor() {
//		if (veiculo instanceof Passeio) {
//			valorParaCalculo = valorParaCalculo(Veiculo);
//		}else {
//			valorParaCalculo = valorParaCalculo(Veiculo);
//		}
//
//		return valorParaCalculo * Math.ceil(tempo / DIA);
//	}
}
