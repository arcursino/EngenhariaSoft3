package br.com.fatec;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Date data = new Date();
//		Veiculo v = new Passeio(data.getTime());
		Veiculo v = new Passeio(2592E6);

		ContaEstacionamento c = new ContaEstacionamento(v);

//		CalculoValor cv = null;

//		c.valorConta();
		System.out.println(c.valorConta());
		

	}

}
