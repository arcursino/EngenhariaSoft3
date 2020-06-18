package external;

import java.util.Date;

public class Transacao {
	private Date data;
	private Conta conta;
	private double valor;	

	public Transacao(Date data, Conta conta, double valor) {
		this.data = data;
		this.conta = conta;
		this.valor = valor;		
	}

	public Date getData() {
		return data;
	}

	public Conta getConta() {
		return conta;
	}

	public double getValor() {
		return valor;
	}
}