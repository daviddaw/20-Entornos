package ejercicio;

public class Principal {

	public static void main(String[] args) {
		//creamos un cantante, un disco y varias canciones que insertamos directamente para probar el programa
		//creamos un cantante:
		Cantante cantante=new Cantante("Ana", "España");
		
		System.out.println("Creamos el disco ");
		
		Disco disco=new Disco ("Tierra", cantante, 4);
		//añadimos varias canciones:
		Cancion c1=new Cancion ("Cancion1", 30); 
		Cancion c2=new Cancion ("Cancion2", 10); 
		
		
		disco.insertar(c1); disco.insertar(c2);
		 
		
		System.out.println(disco.toString());
		
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println("1.- Dar de alta una cancion");
			System.out.println("2.- Obtener canciones que superen una duración");
			System.out.println("3.- Visualizar los datos del disco");
			System.out.println("4.- Salir");
			do {
				System.out.println("Introduce opcion (1-4)");
				opcion = LeerTeclado.readInteger();
			} while (opcion < 1 || opcion > 4);
		
			switch (opcion){
			case 1: altaCancion(disco);break;
			case 2: verCanciones(disco);break;
			case 3: visualizarDisco(disco);break;
			case 4: System.out.println("Fin de programa");break;
			}	
		}
		while (opcion!=4);
	}

	private static void altaCancion(Disco disco) {
		
		System.out.println("Introduce titulo y duración de la cancion");
		String titulo=LeerTeclado.readString();
		double duracion=LeerTeclado.readDouble();
		
		Cancion cancion=new Cancion(titulo,duracion);
		disco.annadir(cancion);		
	}
	
	private static void verCanciones(Disco disco){
		disco.obtenerCanciones();
	}
	
	private static void visualizarDisco (Disco disco){
		disco.visualizarDisco();
	}
	
	
	
	
	

}
