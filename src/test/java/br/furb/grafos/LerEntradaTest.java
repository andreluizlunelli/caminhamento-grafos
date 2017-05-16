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
		String text = "(42,3)(41,1)\n(40,5)(42,4)";
		try {
			Files.write(Paths.get("vertices1.txt"), text.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LerEntrada lerEntrada = new LerEntrada(new File("vertices1.txt"));
		List<Vertice> list = lerEntrada.getVertices();
		
		Vertice v1 = list.get(0);
		Vertice v2 = list.get(1);
		Vertice v3 = list.get(2);
		Vertice v4 = list.get(3);
		
		Vertice expected1 = new Vertice(42, 3);
		Vertice expected2 = new Vertice(41, 1);
		Vertice expected3 = new Vertice(40, 5);
		Vertice expected4 = new Vertice(42, 4);
		
		Assert.assertTrue(expected1.isSame(v1));
		Assert.assertTrue(expected2.isSame(v2));		
		Assert.assertTrue(expected3.isSame(v3));		
		Assert.assertTrue(expected4.isSame(v4));				
	}
	
}
