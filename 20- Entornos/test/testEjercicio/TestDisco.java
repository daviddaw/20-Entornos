package testEjercicio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ejercicio.Cancion;
import ejercicio.Cantante;
import ejercicio.Disco;

public class TestDisco {
	Disco disco;
	Cancion cancion1;
	Cantante cantante1;
	@Before
	public void setUp() throws Exception {
		cantante1=new Cantante("david","españa");
		cancion1=new Cancion("el perro", 3);
		disco=new Disco("pajaro",cantante1,60);
		
	}

	@Test
	public void testAnnnadir() {//envio cancion y devuelveboolean
		disco.annadir(cancion1);
		
		assertTrue(condition);
	}

}
