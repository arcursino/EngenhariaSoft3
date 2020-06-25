package model;

import java.util.ArrayList;

public class ListaAnimais {
	public ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
	
	public void setLista(Animal animal) {
		listaAnimais.add(animal);
	}
	
	public ArrayList<Animal> getlista(){
		return this.listaAnimais;
	}
	
	
	public ArrayList<Animal> getTipo(String raca){
		ArrayList<Animal> lista = new ArrayList<Animal>();
		if(raca.equals("boi")) {
			for(Animal animal:this.listaAnimais) {
				if(animal instanceof Bovino) {
					lista.add(animal);	
				}
			}
		}else {
			for(Animal animal:this.listaAnimais) {
				if(animal instanceof Suino) {
					lista.add(animal);	
				}
			}
		}
		return lista;
	}
	
	
	public ArrayList<Animal> getRaca(Raca raca){
		ArrayList<Animal> lista = new ArrayList<Animal>();
		for(Animal animal: this.listaAnimais) {
			if(animal.getRaca() == raca) {
				lista.add(animal);
			}
		}
		return lista;
	}
}
