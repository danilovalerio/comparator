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
		
		//Implementação via Lambda, torna menos verbosa (arrow function do JS)
		//o compilador faz a inferencia de Produto para p1 e p2, assim dispensa a necessidade de colocar 'Produto p1'
		Comparator<Produto> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()); //comparator numa única linha
				
		stock.sort(comp);
		
		for(Produto p : stock) {
			System.out.println(p);
		}

	}

}
