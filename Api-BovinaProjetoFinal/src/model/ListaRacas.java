package model;

import java.util.ArrayList;

public class ListaRacas {
	protected ArrayList<Raca> listaRacas = new ArrayList<Raca>();

	public ArrayList<Raca> getListaRacas() {
		return listaRacas;
	}

	public void setListaRacas(Raca raca) {
		this.listaRacas.add(raca);
	}
	
	public Raca getOne(int index) {
		return this.listaRacas.get(index);
	}
	
}
