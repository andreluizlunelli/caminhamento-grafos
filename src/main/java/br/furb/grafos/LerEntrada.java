// André Lunelli e Plamedi Lusembo
package br.furb.grafos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class LerEntrada {
	
	private List<Vertice> listVertice = new ArrayList<Vertice>();
	private List<Aresta> listAresta = new ArrayList<Aresta>();
	private File file = null;
	
	public LerEntrada(File file) {
		this.file = file;
		extrairVertices();
	}

	private void extrairVertices() {
		try (Scanner scanner = new Scanner(file)) {			
			int i = 1;
			while (scanner.hasNext()){
				Vertice vertice = null;
				Aresta aresta = null;
				String line = scanner.nextLine();
				String[] s = line.split("\\)");				
				String[] s2;
				String[] s3;
				Vertice origem = null;
				Vertice destino = null; 
				for (String _s : s) {
					s2 = _s.split("\\(");					
					s3 = s2[1].split(",");
					int x = Integer.parseInt(s3[0]);
					int y = Integer.parseInt(s3[1]);
					vertice = buscarVerticeXY(x, y);
					if (vertice == null) {
						vertice = new Vertice(x, y);
						vertice.setNomex(i);
						vertice.setNome("V"+i);
						i++;
						addVertice(vertice);
					}					
					if (origem == null) {
						origem = vertice;
					} else if (origem != null && destino == null) {
						destino = vertice;						
					} else {
					}
					
				}						
				if (vertice != null) {
					aresta = new Aresta(origem, destino);					
					addAresta(aresta);
					
					origem = null;
					destino = null;
				}
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Vertice buscarVerticeXY(int x, int y) {
		Vertice v = null;
		for (Vertice vertice : listVertice) {
			if (vertice.getX() == x && vertice.getY() == y) {
				return vertice;
			}
		}
		return v;
	}

	public List<Vertice> getVertices() {		
		return this.listVertice;
	}
	
	public void addVertice(Vertice v) {
		this.listVertice.add(v);
	}

	public void addAresta(Aresta a) {
		this.listAresta.add(a);
	}

	public List<Aresta> getArestas() {
		return this.listAresta;
	}

	public double[] getMatrizCusto() {
		return new double[1];
	}

	public void preencherArestasDoVertice() {
		for (Vertice vertice : listVertice) {
			for (Aresta aresta : listAresta) {
				if (aresta.getDestino().isSame(vertice) 
					|| aresta.getOrigem().isSame(vertice)) {
					vertice.addAresta(aresta);
				}
			}
		}		
	}
	
}
