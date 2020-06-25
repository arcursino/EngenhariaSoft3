package model;

import java.util.ArrayList;

public class Relatorios {
	private ArrayList<Animal> listaAnimais = new ArrayList<Animal>();

	public ArrayList<Animal> getListaAnimais() {
		return listaAnimais;
	}

	public void setListaAnimais(ArrayList<Animal> listaAnimais) {
		this.listaAnimais = listaAnimais;
	}
	
	public String ValorRebanho() {
		CalculadoraPreco calculadora = new CalculadoraPreco();
		String valor =  String.valueOf(calculadora.getValorList(this.listaAnimais));
		return "Valor total do rebanho: "+valor;
	}
	
	public String PesoRebanho() {
		float arrobas = 0;
		float quilos = 0;
		for(Animal animal: this.listaAnimais) {
			arrobas = arrobas + animal.getArrobas();
			quilos = quilos + animal.getQuilos();
		}
		return "Peso total do rebanho em Quilos: "+String.valueOf(quilos) + " em Arrobas: " + String.valueOf(arrobas);
	}
	
	public String DistribuicaoGeneros() {
		float macho = 0;
		float femea = 0;
		for(Animal animal: this.listaAnimais) {
			if(animal.getGenero().equals("femea")) {
				femea++;
			}
			else {
				macho++;
			}
		}
		float total = this.listaAnimais.size();
		return "O rebanho tem um total de: " +String.valueOf(total)+" Animais sendo : "+String.valueOf(macho/total*100)+"% macho e "+String.valueOf(femea/total*100)+"% femea";
	}
	
	public String DistribuicaoVacinas() {
		float animaisEmDia = 0;
		float naoEmDia = 0;
		for(Animal animal:this.listaAnimais) {
			if(animal instanceof Bovino) {
				CarteiraVacina carteira = animal.getVacina();
				if(carteira instanceof CarteiraVacinaBovino) {
//					if(carteira.getRaiva().equals(null)||carteira.getCarbunculo().equals(null)||carteira.getBrucelose().equals(null)||carteira.getAftosa().equals(null)) {
						if(carteira.getRaiva() == null||carteira.getCarbunculo() == null||carteira.getBrucelose() == null||carteira.getAftosa() == null) {
						naoEmDia++;
					}
					else {
						animaisEmDia++;
					}
				}
			}
			else {
				CarteiraVacina carteira = animal.getVacina();
				if(carteira instanceof CarteiraVacinaBovino) {
					if(carteira.getPneumonia().equals(null)||carteira.getGlasser().equals(null)||carteira.getRotavirus().equals(null)||carteira.getRinite().equals(null)) {
						naoEmDia++;
					}
					else {
						animaisEmDia++;
					}
				}
			}
		}
		return "Porcentagem de animais vacinados no rebanho e de :"+String.valueOf(animaisEmDia/this.listaAnimais.size()*100)+"% - Animais que precisam finalizar a vacinacao "+String.valueOf(naoEmDia);
	}
}
