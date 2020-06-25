package model;

import java.util.ArrayList;
import java.util.Date;

public class HistoricoVendas {
	private ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
	private ArrayList<Animal> listaVenda = new ArrayList<Animal>();
	private ArrayList<Venda> historicoVenda = new ArrayList<Venda>();

	public HistoricoVendas(ArrayList<Animal> listaAnimais) {
		super();
		this.listaAnimais = listaAnimais;
	}
	
	public void AdicionarListaVenda(Animal animal) {
		this.listaVenda.add(animal);
	}
	
	public void EfetuarVenda() {
		for(Animal animal:this.listaVenda) {
			this.listaAnimais.remove(animal);
			Date data = new Date();
			Venda venda = new Venda(animal,data);
			this.historicoVenda.add(venda);
		}
	}

	public ArrayList<Animal> GetListaAnimais(){
		return this.listaAnimais;
	}
	
	public ArrayList<Venda> GetListaVenda(){
		return this.historicoVenda;
	}
	
	public void GetHistorico() {
		CalculadoraPreco calculadora = new CalculadoraPreco();
		System.out.println("Valor total da venda: "+String.valueOf(calculadora.getValorList(this.listaVenda)));
		for(Venda item:this.historicoVenda) {
			System.out.println("Vendido em: "+item.getData());
			if(item.getAnimal() instanceof Bovino) {
				System.out.println("Boino da raca "+item.getAnimal().getRaca().getNome());
			}
			else {
				System.out.println("Suino da raca "+item.getAnimal().getRaca().getNome());
			}
			System.out.println("Genero: "+item.getAnimal().getGenero());
			System.out.println("Peso em quilos: "+ String.valueOf(item.getAnimal().getQuilos()));
			System.out.println("Valor do quilo: "+String.valueOf(item.getAnimal().getRaca().getValorQuilos()));
			System.out.println("Valor do Animal: "+String.valueOf(calculadora.getvalor(item.getAnimal())));
		}
	}
	
}