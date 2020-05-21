package fatec;

import java.io.IOException;

public abstract class Registro {

	protected abstract String getNomeTitular();

	protected abstract String getNome();

	protected abstract String getCPF();

	protected abstract String getValor();

	protected abstract String getParcelas();

	protected abstract String getData();

	protected abstract String getBancoPagamento();

	protected abstract String getBancoRecebimento();

	protected abstract String getNumeroBoleto();
	
}