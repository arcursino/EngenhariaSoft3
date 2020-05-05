package br.com.aplicacao.fatec;
import br.com.modelo.fatec.Produto;
import br.com.negocio.fatec.CalculadorPreco;
import br.com.negocio.fatec.Desconto;
import br.com.negocio.fatec.DescontoDinheiro;
import br.com.negocio.fatec.DescontoPorcentagem;

public class Sistema {
	public static void main(String[] args) {
		Produto p1 = new Produto("NoteBook", 2500);
		Desconto desconto = new DescontoDinheiro(200);
		Desconto desconto2 = new DescontoPorcentagem(50,p1.getValorProduto());
		CalculadorPreco calc = new CalculadorPreco(p1,desconto2);
		System.out.println("O valor do produto para, com desconto: R$ " + calc.calcularDescontos());
	}
}