package model;

import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raca racaBoi = new RacaBuilder().IniciarBovino().valorArrobas(30).nome("Boi de briga").criar();
		Animal boi = new AnimalBuilder().IniciarBovino().quilos(300).raca(racaBoi).criar();
		Raca racaPorco = new RacaBuilder().IniciarSuino().valorQuilos(10).nome("bacon de mini porco").criar();
		Animal porco = new AnimalBuilder().IniciarSuino().arrobas(15).raca(racaPorco).criar();
		Vacina vacinaBoi = new VacinaBuilder().IniciarVacinaBovino().frequencia(120).nomeVacina("febre aftosa").criar();
		//CarteiraVacina boi1 = new CarteiraVacina().animal("boi").dosagem();
		
		
		
		ListaAnimais lista = new ListaAnimais();
		lista.setLista(boi);
		lista.setLista(porco);
		lista.setLista(boi);
		lista.setLista(boi);
		lista.setLista(porco);
		lista.setLista(boi);
		ArrayList<Animal> x = lista.getTipo("porco");
		ArrayList<Animal> x2 = lista.getlista();
		CalculadoraPreco calc = new CalculadoraPreco();
		System.out.println(calc.getValorList(x));
		System.out.println(calc.getValorList(x2));
		System.out.println(calc.getvalor(porco));
		
	}

}
