package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import paquete.Factorial;

public class testFactorial {
	Factorial factorial;
	int num;
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		factorial=new Factorial(-3);
		try {
			int esperado=factorial.calculo();
			assertTrue(esperado==-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testRango() {
		factorial=new Factorial(16);
		try {
			int esperado=factorial.calculo();
			assertTrue(esperado==-2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNormal() {
		factorial=new Factorial(5);
		try {
			int esperado=factorial.calculo();
			assertTrue(esperado==120);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
