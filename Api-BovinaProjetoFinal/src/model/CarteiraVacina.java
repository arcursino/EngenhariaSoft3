package model;


public abstract class CarteiraVacina {
	protected Animal animal;
	protected Dosagem dosagem;
	
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Dosagem getDosagem() {
		return dosagem;
	}
	public void setDosagem(Dosagem dosagem) {
		this.dosagem = dosagem;
	}
		
}

