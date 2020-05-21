package br.com.negocio.fatec;

import br.com.modelo.fatec.Produto;

public class DescontoPorcentagem implements Desconto {
	private double valorDesconto;
	private double produto;
	
	public DescontoPorcentagem(double valor, double produto) {
		this.valorDesconto = valor;
		this.produto = produto;
	}

	@Override
	public double valor() {
		valorDesconto = (valorDesconto / 100) * produto;
		return valorDesconto;
	}
	
}
