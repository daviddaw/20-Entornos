package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paquete1.Array;

public class TestArray {
	int[] miArray;
	Array array; //guarda el array miarray1 en operacionesArray
	@Before
	public void setUp() throws Exception {
		miArray= new int[] {4,1,5,2};
		array = new Array(miArray);
	}

	@Test
	public void testConstructor() {
		int[] nuevoArray= new int[]{4,1,5,2};
		assertArrayEquals(nuevoArray,miArray);	
	}
	
	@Test
	public void testOrdenar() {
		int[] esperado= new int[]{1,2,4,5};//resultado esperado
		array = array.ordenar();//guardo mi objeto consu atributo modificado
		int[] actual = array.getArray();//guardo en actual mi array modificado
		assertArrayEquals(esperado,actual);
	}
	
	@Test
	public void testInvertido() {
		int[] esperado= new int[]{2,5,1,4};//resultado esperado
		array = array.invertir();//guardo mi objeto consu atributo modificado
		int[] actual = array.getArray();//guardo en actual mi array modificado
		assertArrayEquals(esperado,actual);
	}
	

	
	@Test
	public void testMinimo() {
		int esperado= 1;//resultado esperado
		int actual = array.minimo();//guardo en actual mi array modificado
		assertTrue(esperado==actual);
	}
	
	@Test
	public void testBuscar() {
		boolean esperado= true;//resultado esperado
		boolean actual = array.buscar(1);//guardo en actual mi array modificado
		assertTrue(esperado==actual);
	}
	
	//Falta pasarle un objeto del tipo operaciones array creado por mi
	public void testEquals() { 
		boolean esperado= true;//resultado esperado
		boolean actual = array.equals(array);//guardo en actual mi array modificado 
		assertTrue(esperado==actual);
	}
	
	@Test
	public void testInicializar() {
		boolean esperado= true;//resultado esperado
		boolean actual = array.buscar(1);//guardo en actual mi array modificado
		assertTrue(esperado==actual);
	}
	
	///no tengo que machacar las operaciones array por que es objeto de la clase Operaciones,
	//no tengo que sobrescribirlo o bien el local  no lo guardo dentro un objeto o bien creo otra variable de operacionesarray

}
