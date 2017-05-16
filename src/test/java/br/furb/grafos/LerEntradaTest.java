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
		
		Vertice expected1 = new Vertice(42, 3);
		Vertice expected2 = new Vertice(40, 5);
		
		Assert.assertEquals(expected1, v1);
		Assert.assertEquals(expected2, v2);		
		
	}
	
}
