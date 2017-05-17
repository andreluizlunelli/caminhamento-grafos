package br.furb.grafos;

public class Aresta {

	private Vertice origem;
	private Vertice destino;
	
	public Aresta(Vertice origem, Vertice destino) {
		this.origem = origem;
		this.destino = destino;
	}

	public boolean isSame(Aresta outra) {		
		return (this.origem.isSame(outra.origem) 
				&& this.destino.isSame(outra.destino));
	}

}
