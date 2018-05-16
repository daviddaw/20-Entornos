package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import paquete.Punto;
import paquete.Rectangulo;

public class RectanguloTest {
	Rectangulo rectangulo;
	Rectangulo rectangulo2;
	Punto punto1;
	Punto punto2;

	@Before
	public void setUp() throws Exception {
		//puntos      punto(ancho,alto)
		punto1=new Punto(7,5);
		punto2=new Punto(3,7);
		rectangulo= new Rectangulo(punto1,punto2);
		rectangulo2= new Rectangulo(punto1,10,10);	
		
	}

	@Test
	public void testAlto() {	
		//devuelve altura
	
	
	assertTrue(rectangulo.alto()==2);
		
	}
	
	@Test
	public void testAncho() {
			
	
		assertTrue(rectangulo.ancho()==4);
	}
	
	
	@Test
	public void testPerimetro() {
		
		
		assertTrue(rectangulo.perimetro()==12);
	}
	
	@Test
	public void testArea() {
		assertTrue(rectangulo.area()==8);
	}
	@Test
	public void testDesplazar() {
		rectangulo.desplazar(6, 2);
		assertTrue(punto1.getX()==13 && punto2.getX()==9 && punto1.getY()==7 && punto2.getY()==9 );
	}

}
