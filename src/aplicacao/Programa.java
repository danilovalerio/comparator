package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> stock = new ArrayList<>();
				
		stock.add(new Produto("Tv", 900.0));
		stock.add(new Produto("Notebook", 1200.0));
		stock.add(new Produto("Tablet", 400.0));
		
		stock.sort(new MyComparator());
		
		for(Produto p : stock) {
			System.out.println(p);
		}

	}

}
