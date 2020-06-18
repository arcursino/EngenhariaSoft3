package external;

import java.util.Date;

public class Conta {
	private Date dataAbertura;
	private String banco;
	private String agencia;

	public Conta(Date dataAbertura, String banco, String agencia) {
		this.dataAbertura = dataAbertura;
		this.banco = banco;
		this.agencia = agencia;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public String getBanco() {
		return banco;
	}

	public String getAgencia() {
		return agencia;
	}
}