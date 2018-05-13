package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paquete1.Array;

public class TestArrray3 {
	//Atributos
	Array array;//he declarado un objeto array de tipo Array
	
	
	@Before   //valor inicial por defecto para todos lostest
	public void valoresIniciales() throws Exception {
		//cuando le haga el new Array podre creare mi objeto para  acceder a los metodos de la clase Array
		
		
		
		
	}

	@Test
	public void test() {
		System.out.println(array.getArray()[0]);
	}

}
