package model;

import java.util.ArrayList;

public class CalculadoraPreco {
	public float getvalor(Animal animal) {
		float x = animal.getArrobas() * animal.getRaca().valorArrobas;
		return x;
	}
	
	public float getValorList(ArrayList<Animal> listaAnimais) {
		float x = 0;
		for(Animal animal: listaAnimais) {
			x = x + animal.getArrobas() * animal.getRaca().valorArrobas;
		}
		return x;
	}
}
