package fatec;



public class Registros {
	private Registro[] listaRegistros;

	public Registro[] getListaRegistros() {
		return listaRegistros;
	}

	public void setListaRegistros(Registro[] listaRegistros) {
		this.listaRegistros = listaRegistros;
	}

	public String registrosToText() {
		String stringRegistros = new String();
		for(Registro r: this.listaRegistros) {
			if(r instanceof Pagamento_credito) {
				stringRegistros = stringRegistros + "\n Cartao de credito";
				stringRegistros = stringRegistros +'\n' +"Nome Titular: " + r.getNomeTitular() + '\n';
				stringRegistros = stringRegistros +"Parcelas: "+ r.getParcelas() + '\n';
				stringRegistros = stringRegistros +"Banco pagamento: "+ r.getBancoPagamento() + '\n';
				stringRegistros = stringRegistros +"Banco recebimento: "+ r.getBancoRecebimento() + '\n';
				stringRegistros = stringRegistros +"Nome: "+ r.getNome() + '\n';
				if(Cpf_validator.isValid(r.getCPF())) {
					stringRegistros = stringRegistros +"CPF: "+ r.getCPF() + '\n';
				}
				else {
					stringRegistros = stringRegistros +"CPF: "+ "invalido" + '\n';
				}
				stringRegistros = stringRegistros +"Valor: "+ r.getValor() + '\n';
				stringRegistros = stringRegistros +"Data: "+ r.getData() + '\n';
				stringRegistros = stringRegistros + "------------------------------------------";

			}
			if(r instanceof Pagamento_debito) {
				stringRegistros = stringRegistros + "\n Cartao de debito";
				stringRegistros = stringRegistros+'\n' +"Nome Titular: " + r.getNomeTitular() + '\n';
				stringRegistros = stringRegistros +"Banco pagamento: "+ r.getBancoPagamento() + '\n';
				stringRegistros = stringRegistros +"Banco recebimento: "+ r.getBancoRecebimento() + '\n';
				stringRegistros = stringRegistros +"Nome: "+ r.getNome() + '\n';
				if(Cpf_validator.isValid(r.getCPF())) {
					stringRegistros = stringRegistros +"CPF: "+ r.getCPF() + '\n';
				}
				else {
					stringRegistros = stringRegistros +"CPF: "+ "invalido" + '\n';
				}
				stringRegistros = stringRegistros +"Valor: "+ r.getValor() + '\n';
				stringRegistros = stringRegistros +"Data: "+ r.getData() + '\n';
				stringRegistros = stringRegistros + "------------------------------------------";
			}
			if(r instanceof Pagamento_boleto) {
				stringRegistros = stringRegistros + "\n Boleto";
				stringRegistros = stringRegistros +"\n Numero boleto: "+ r.getNumeroBoleto() + '\n';
				stringRegistros = stringRegistros +"Nome: "+ r.getNome() + '\n';
				if(Cpf_validator.isValid(r.getCPF())) {
					stringRegistros = stringRegistros +"CPF: "+ r.getCPF() + '\n';
				}
				else {
					stringRegistros = stringRegistros +"CPF: "+ "invalido" + '\n';
				}
				stringRegistros = stringRegistros +"Banco pagamento: "+ r.getBancoPagamento() + '\n';
				stringRegistros = stringRegistros +"Banco recebimento: "+ r.getBancoRecebimento() + '\n';
				stringRegistros = stringRegistros +"Valor: "+ r.getValor() + '\n';
				stringRegistros = stringRegistros +"Data: "+ r.getData() + '\n';
				stringRegistros = stringRegistros + "------------------------------------------";
			}
			
		}
		return stringRegistros;
	}
	
}
