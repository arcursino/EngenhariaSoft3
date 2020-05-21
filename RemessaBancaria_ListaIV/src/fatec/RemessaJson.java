package fatec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class RemessaJson extends Leitor {
	@Override
	protected String construirArquivo() throws IOException {
		String json = String.join(" ", Files.readAllLines(Paths.get("complemento IV/remessa.json"), StandardCharsets.UTF_8));
		Gson gson = new Gson();
		Registro[] registros = gson.fromJson(json, Registro[].class);
		Registros r = new Registros();
		r.setListaRegistros(registros);
		return r.registrosToText();
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
//	private String numeroCartao;
//	private String nomeTitular;
//	private int parcelas;
//	private String nome;
//	private String CPF;
//	private String bancoRecebimento;
//	private String bancoPagamento;
//	private String data;
//	private int valor;
//	
//	public String getNumeroCartao() {
//		return numeroCartao;
//	}
//	public void setNumeroCartao(String numeroCartao) {
//		this.numeroCartao = numeroCartao;
//	}
//	public String getNomeTitular() {
//		return nomeTitular;
//	}
//	public void setNomeTitular(String nomeTitular) {
//		this.nomeTitular = nomeTitular;
//	}
//	public int getParcelas() {
//		return parcelas;
//	}
//	public void setParcelas(int parcelas) {
//		this.parcelas = parcelas;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getCPF() {
//		return CPF;
//	}
//	public void setCPF(String cPF) {
//		CPF = cPF;
//	}
//	public String getBancoRecebimento() {
//		return bancoRecebimento;
//	}
//	public void setBancoRecebimento(String bancoRecebimento) {
//		this.bancoRecebimento = bancoRecebimento;
//	}
//	public String getBancoPagamento() {
//		return bancoPagamento;
//	}
//	public void setBancoPagamento(String bancoPagamento) {
//		this.bancoPagamento = bancoPagamento;
//	}
//	public String getData() {
//		return data;
//	}
//	public void setData(String data) {
//		this.data = data;
//	}
//	public int getValor() {
//		return valor;
//	}
//	public void setValor(int valor) {
//		this.valor = valor;
//	}
//	
//	@Override
//	protected String construirArquivoJson() throws IOException {
//		String json = String.join(" ", Files.readAllLines(Paths.get("C:\\Users\\arian\\Desktop\\repositorios\\engsoft3\\Banco\\src\\remessa.json"), StandardCharsets.UTF_8));
//		
//		return json;
//	}
//	@Override
//	protected String construirArquivoXml() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
				
	/*protected construirArquivoJson() {
		String leitorjson = "[{'numeroCartao':'59105948', 'nomeTitular':'Viriato Ayres, 'parcelas': 7}, {'numeroCartao':'59105948', 'nomeTitular':'Viriato Ayres, 'parcelas': 7}]";
		
		Gson gson = new Gson();
		//Type listType = new TypeToken<List<Post>>(){}.getType();
		//List<Post> posts = gson.fromJson(leitorjson, listType);	
	
	}*/

	
//}