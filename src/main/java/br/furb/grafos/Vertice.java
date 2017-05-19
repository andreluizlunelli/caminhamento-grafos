package br.furb.grafos;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	
	private String nome;
	private int nomex;
	private int x;
	private int y;	
	private List<Aresta> arestas = new ArrayList<Aresta>(); 
	
	public Vertice(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isSame(Vertice outra) {
		return (x == outra.x && y == outra.y);
	}
	public List<Aresta> getArestas() {
		return arestas;
	}
	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	
	public void addAresta(Aresta aresta) {		
		this.arestas.add(aresta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNomex() {
		return nomex;
	}

	public void setNomex(int nomex) {
		this.nomex = nomex;
	}

	@Override
	public String toString() {		
		return String.format("x:%d y:%d %s", this.getX(), this.getY(), this.getNome());
	}
}
