package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import paquete1.OperacionesArray;

public class TestArray2 {
	OperacionesArray operacionesArray;//atributo de la clase array (Es un objeto no un array)


	
	//inicializacion
	@Before
	public void setUp(){
		//comprobar los constructores de la clase array
		//hay dos uno recbe longitud y otro recibe un array voy a usar este int[] array  
		int[] miArray= {1,2};//creo el array para enviarlo
		operacionesArray= new OperacionesArray(miArray);////CREAMOS UN OBJETO ARRAY  CON EL NEW para pasarle el array
		
		
		
		
		
		

		
		
		
	}

	@Test
	public void test() {
		//quiero probar el metodo invertir mi array
		operacionesArray.invertir();
	//	assertArrayEquals(, actuals);
		
	}

}
