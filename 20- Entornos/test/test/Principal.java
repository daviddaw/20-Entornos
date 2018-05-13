package test;

import java.lang.reflect.Array;

public class Principal {
	Array array;//Estoy creando un atributo de la clase, siempre le acompañara
	//cuando creamos una variable en un metodo no acompaña  a la clase cuando muere el metodo muere
	
	
	public Principal(Array array) {
		super();
		this.array = array;
	}


	public static void main(String[] args) {
		Array otroArray;//Estoy declarando un objeto de tipo Array pero es local
		int[] array = {1,2,3,4};//E;stoy creando  e iniciando un array de tipo local
		System.out.println(array);//si imprimimosel array sale la dir de memoria donde esta 
		    System.out.println( new paquete1.Array(array));//hago un new de la clase hagouna instancia de la clase pero si no lo guardo muere			
			System.out.println(new paquete1.Array(array));//si no lo guardo muere
			
			 
		

	}

}
