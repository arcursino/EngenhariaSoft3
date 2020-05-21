package br.com.fatec;

public class ContaEstacionamento {

	public ContaEstacionamento(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	private CalculoValor calculo;
	public Veiculo veiculo;
	private double inicio, fim;
	public double x;

	public double valorConta() {
		
		if (veiculo.tempo > (2592E6 / 2)) {
			calculo = new ValorMensal(veiculo.valor);
		}
		
		
		else if (veiculo.tempo > (12 * 3600000)) {
			calculo = new ValorDiaria(veiculo.valor);

		}
		else {
			calculo = new ValorHora(veiculo.valor);
		}
		
		
		return calculo.valorConta(veiculo.tempo,veiculo);
	}

	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}
}