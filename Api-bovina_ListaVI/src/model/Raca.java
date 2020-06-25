package model;

public abstract class Raca {
	protected String nome;
	protected float valorQuilos;
	protected float valorArrobas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorQuilos() {
		return valorQuilos;
	}
	public void setValorQuilos(float valorQuilos) {
		this.valorQuilos = valorQuilos;
	}
	public float getValorArrobas() {
		return valorArrobas;
	}
	public void setValorArrobas(float valorArrobas) {
		this.valorArrobas = valorArrobas;
	}
	
}
