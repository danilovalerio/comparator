package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> stock = new ArrayList<>();
				
		stock.add(new Produto("Tv", 900.0));
		stock.add(new Produto("Notebook", 1200.0));
		stock.add(new Produto("Tablet", 400.0));
		
		Comparator<Produto> comp = new Comparator<Produto>() {
			//Implementando comparator através de uma classe anônima 
			
			@Override
			public int compare(Produto p1, Produto p2) {
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
		};
			
		//Segunda forma de criar um comparator, assim
		//se torna desnecessária a classse 'MyComparator'
		stock.sort(comp);
		
		for(Produto p : stock) {
			System.out.println(p);
		}

	}

}
