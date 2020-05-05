package br.com.negocio.fatec;

public class DescontoDinheiro implements Desconto {
	private double valorDesconto;
	
	public DescontoDinheiro(double valor) {
		this.valorDesconto = valor;
	}

	@Override
	public double valor() {
		return valorDesconto;
	}
	
}
