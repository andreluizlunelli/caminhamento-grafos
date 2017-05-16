package br.furb.grafos;

public class Vertice {
	private int x;
	private int y;	
	
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

	public boolean isSame(Vertice v1) {
		return (x == v1.x && y == v1.y);
	}
	
}
