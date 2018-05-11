package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paquete1.Array;

public class TestArray {
	int[] miArray1= new int[] {4,1};
	Array array = new Array(miArray1);
	
	
	

	@Before
	public void setUp() throws Exception {
		
		


		
		
		
	}

	@Test
	public void test() {
		int[] miArray= new int[]{4,1};
	
	
	//assertArrayEquals(miArray,array.);
		assertArrayEquals(miArray,miArray1);
	//assertTrue(miArray==miArray1);
	
	
	
	}
	@Test
	public void test2() {
		int[] miArray= new int[]{4,1};
		array.invertir();
		
		System.out.println(array[0]);
	
	//assertArrayEquals(miArray,array.);
		assertArrayEquals(miArray,miArray1);
	//assertTrue(miArray==miArray1);
	
	
	
	}

}
