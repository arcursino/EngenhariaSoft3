package model;

import java.util.ArrayList;
import java.util.Date;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date();
		CreateId id = new CreateId();
		CarteiraVacina carteiraVazia = new CVBBuilder().IniciarCarteira().Criar();
		CarteiraVacina carteiraCheiaBOI = new CVBBuilder().IniciarCarteira().Aftosa(data).Brucelose(data).Carbunculo(data).Raiva(data).Criar();
		Raca racaBoi = new RacaBuilder().IniciarBovino().valorArrobas(30).nome("Boi de briga").criar();
		Animal boiM = new AnimalBuilder().IniciarBovino().quilos(300).raca(racaBoi).dataNasc(data).genero("macho").vacina(carteiraCheiaBOI).criar();
		Animal boiF = new AnimalBuilder().IniciarBovino().quilos(300).raca(racaBoi).dataNasc(data).genero("femea").vacina(carteiraVazia).criar();
		Raca racaPorco = new RacaBuilder().IniciarSuino().valorQuilos(10).nome("bacon de mini porco").criar();
		Animal porco = new AnimalBuilder().IniciarSuino().arrobas(15).raca(racaPorco).criar();
		ListaAnimais lista = new ListaAnimais();
		lista.setLista(boiM);
		lista.setLista(boiM);
		lista.setLista(boiF);
		lista.setLista(boiF);
		Relatorios relatorio = new Relatorios();
		relatorio.setListaAnimais(lista.getlista());
		System.out.println(relatorio.DistribuicaoGeneros());
		System.out.println(relatorio.DistribuicaoVacinas());
		System.out.println(relatorio.ValorRebanho());
		System.out.println("===========================");
		HistoricoVendas hist = new HistoricoVendas(lista.getlista());
		hist.AdicionarListaVenda(boiM);
		hist.EfetuarVenda();
		hist.GetHistorico();
		System.out.println("===========================");
		relatorio.setListaAnimais(hist.GetListaAnimais());
		System.out.println(relatorio.DistribuicaoGeneros());
		System.out.println(relatorio.DistribuicaoVacinas());
		System.out.println(relatorio.ValorRebanho());
		
		
		
	}

}
