package br.com.negocio.fatec;

import br.com.modelo.fatec.Produto;

public class CalculadorPreco{
	private Produto produto;
	private Desconto desconto;

	public CalculadorPreco(Produto produto, Desconto desconto) {
		this.produto = produto;
		this.desconto = desconto;
	}

	public double calcularDescontos() {
		return produto.getValorProduto() - desconto.valor();
	}
}
