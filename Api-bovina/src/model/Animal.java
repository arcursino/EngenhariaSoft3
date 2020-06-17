package model;

// criar calculadora preço, fazer raça string mesmo

public abstract class Animal {
	private Raca raca;
	private float quilos;
	private float arrobas;
	
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public float getQuilos() {
		return quilos;
	}
	public void setQuilos(float quilos) {
		this.quilos = quilos;
	}
	public float getArrobas() {
		return arrobas;
	}
	public void setArrobas(float arrobas) {
		this.arrobas = arrobas;
	}
	
	
}
