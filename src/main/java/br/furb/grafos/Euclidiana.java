// André Lunelli e Plamedi Lusembo
package br.furb.grafos;

public class Euclidiana {
	
	public static double calc(Aresta a) {
		return Math.sqrt(Math.pow((a.getOrigem().getX() - a.getDestino().getX()), 2) + Math.pow((a.getOrigem().getY() - a.getDestino().getY()), 2));
	}
	
}
