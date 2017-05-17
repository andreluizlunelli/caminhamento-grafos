// André Lunelli e Plamedi Lusembo
package br.furb.grafos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class LerEntradaTest {

	@Test
	public void test01() {				
		// CRIA ARQUIVO PARA SER LIDO 
		String text = "(42,3)(41,1)\n(40,5)(42,4)";
		try {
			File folder = new File("c:\\temp\\");
			folder.mkdir();
			File file = new File("c:\\temp\\vertices1.txt");
			Files.write(Paths.get(file.getPath()), text.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LerEntrada lerEntrada = new LerEntrada(new File("vertices1.txt"));
		List<Vertice> listVertices = lerEntrada.getVertices();
		
		Vertice v1 = listVertices.get(0);
		Vertice v2 = listVertices.get(1);
		Vertice v3 = listVertices.get(2);
		Vertice v4 = listVertices.get(3);
		
		Vertice expected1 = new Vertice(42, 3);
		Vertice expected2 = new Vertice(41, 1);
		Vertice expected3 = new Vertice(40, 5);
		Vertice expected4 = new Vertice(42, 4);
		
		Assert.assertTrue(expected1.isSame(v1));
		Assert.assertTrue(expected2.isSame(v2));		
		Assert.assertTrue(expected3.isSame(v3));		
		Assert.assertTrue(expected4.isSame(v4));		
		
		List<Aresta> listArestas = lerEntrada.getArestas();
		
		// aresta
		List<Aresta> arestas = lerEntrada.getArestas();
		
		Aresta aresta1 = new Aresta(v1, v2);
		Aresta aresta2 = new Aresta(v3, v4);
		
		Assert.assertTrue(arestas.get(0).isSame(aresta1));
		Assert.assertTrue(arestas.get(1).isSame(aresta2));		
		
	}	
	
	public void testCriarMatrizDeCusto() {
		LerEntrada lerEntrada = new LerEntrada(new File("vertices2.txt"));
		double[] custosExpected = {{}};
	}
	
}
