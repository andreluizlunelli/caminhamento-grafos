package br.furb.grafos;

public class Aresta {

	private Vertice origem;
	private Vertice destino;
	private double custo;
	
	public Aresta(Vertice origem, Vertice destino) {
		this.origem = origem;
		this.destino = destino;
		custo = Euclidiana.calc(this);
	}	

	public Vertice getOrigem() {
		return origem;
	}



	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}



	public Vertice getDestino() {
		return destino;
	}



	public void setDestino(Vertice destino) {
		this.destino = destino;
	}



	public double getCusto() {
		return custo;
	}



	public void setCusto(double custo) {
		this.custo = custo;
	}



	public boolean isSame(Aresta outra) {		
		return (this.origem.isSame(outra.origem) 
				&& this.destino.isSame(outra.destino));
	}

}
