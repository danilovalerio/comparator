package aplicacao;

import java.util.Comparator;

import entities.Produto;

public class MyComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		//se p1 > p2 retorna 1
		//se p1 = p2 retorna 0
		//se p1 < p2 retorna -1
		
		//compara os produtos por nome independente de letras maisc/minusc.
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}
	
	

}
