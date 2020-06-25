package model;

public class AnimalBuilder {
	private Animal animal;
	
	public AnimalBuilder() {
//		animal = new Bovino();
	}
	public AnimalBuilder IniciarBovino() {
		animal = new Bovino();
		return this;
	}
	
	public AnimalBuilder IniciarSuino() {
		animal = new Suino();
		return this;
	}
	
	public AnimalBuilder raca (Raca raca) {
		animal.setRaca(raca);
		return this;
	}
	
	public AnimalBuilder genero (String genero) {
		animal.setGenero(genero);
		return this;
	}
	
	public AnimalBuilder quilos(float quilos) {
		animal.setQuilos(quilos);
		animal.setArrobas(quilos/30);
		return this;
	}
	
	public AnimalBuilder arrobas(float arrobas) {
		animal.setArrobas(arrobas);
		animal.setQuilos(arrobas*30);
		return this;
	}
	
	public Animal criar() {
		return animal;
	}
}
