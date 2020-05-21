package br.com.modelo.fatec;

import br.com.negocio.fatec.CalculadorPreco;
import br.com.negocio.fatec.Desconto;

public class Produto {
	private String nome;
	private double valorProduto;
	//private CalculadorPreco calculadorPreco;

	public Produto(String nome, double valorProduto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
//		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public double getValorProduto() {
		return valorProduto;
	}

//	public double getValorComDesconto() {
//		calculadorPreco = new CalculadorPreco(this);
//		return calculadorPreco.calcularDescontos();
//	}
	/*
	public class Produto {
		private String nome;
		private double valorProduto;
		public Desconto desconto;

		public Produto(String nome, double valorProduto, DescontoDinheiro deconto) {
			this.nome = nome;
			this.valorProduto = valorProduto;
			this.desconto = deconto;
		}

		public String getNome() {
			return nome;
		}

		public double getValorProduto() {
			return valorProduto;
		}
	}*/
	
	
}