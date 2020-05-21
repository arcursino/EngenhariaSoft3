package fatec;

public class Pagamento_debito extends Registro{
	private String numeroCartao;
	private String nomeTitular;
	private String nome;
	private String CPF;
	private String bancoRecebimento;
	private String bancoPagamento;
	private String data;
	private String valor;
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getBancoRecebimento() {
		return bancoRecebimento;
	}
	public void setBancoRecebimento(String bancoRecebimento) {
		this.bancoRecebimento = bancoRecebimento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	protected String getParcelas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected String getNumeroBoleto() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
