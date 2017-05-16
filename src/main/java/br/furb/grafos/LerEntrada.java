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
	
	private List<Vertice> list = new ArrayList<Vertice>();
	private File file = null;
	
	public LerEntrada(File file) {
		this.file = file;
		extrairVertices();
	}

	private void extrairVertices() {
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()){
				String line = scanner.nextLine();
				String[] s = line.split("\\)");
				for (String _s : s) {
					String[] s2 = _s.split("\\(");
					
					String[] s3 = s2[1].split(",");
					Vertice vertice = new Vertice(Integer.parseInt(s3[0]), Integer.parseInt(s3[1]));
					addVertice(vertice);
									
				}							
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Vertice> getVertices() {		
		return this.list;
	}
	
	public void addVertice(Vertice v) {
		this.list.add(v);
	}
}
