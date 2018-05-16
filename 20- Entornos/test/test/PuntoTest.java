package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import paquete.Punto;

public class PuntoTest {
	Punto punto1;
	Punto punto2;
	Punto punto3;
	Punto punto4;
	

	@Before
	public void setUp() throws Exception {
		punto1=new Punto();
		punto2=new Punto(-1, -1);
		punto3=new Punto(-4, 0);//-5,0
		punto4=new Punto(7,5);//4,1
		//crear varios puntos 
	}
	//y varios metodos que validen distancia y desplazar
	@Test
	public void testDesplazar2() {
		punto2.desplazar(2);
		assertTrue( punto2.getX()==1.0 && punto2.getY()==1.0);
		
	}
	
	@Test
	public void testDesplazar1() {
		punto1.desplazar(5);
		assertTrue( punto1.getX()==5 && punto1.getY()==5);
		
	}
	
	
	
	
	@Test
	public void testDidtancia() {
		Punto otro= new Punto(2,3);
		assertTrue(punto2.distancia(otro)==5);
		
	}
	@Test
	public void testDistancia3	() {
		Punto otro= new Punto(-5,0);
		
		assertTrue(punto3.distancia(otro)==1.0);
		
	}

	@Test
	public void testDistancia4	() {
		Punto otro= new Punto(4,1);
		assertTrue(punto4.distancia(otro)==5.0);
		
	}
	
	
}
