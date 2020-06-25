package model;

import java.util.Date;

public class Venda {
	private Animal animal;
	private Date data;
	public Venda(Animal animal, Date data) {
		super();
		this.animal = animal;
		this.data = data;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
