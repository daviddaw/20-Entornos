package ejercicio;

import java.util.Arrays;

public class Disco {
	
	
	private String codigo="";
	private String titulo;
	private Cantante cantante;
	private static final double duracionMax=60;
	private int tamannoDisco;
	private Cancion [] arrayCanciones;
	private int numActualCanciones;
	//esta variable indica cuántas canciones hay actualmente en el disco para ver si hay hueco
	//podríamos tener también un atributo con la duración real del Disco
	private double duracionReal;
	
	public Disco(String titulo, Cantante cantante, int tamannoDisco){
		
		this.titulo=titulo;
		this.cantante=cantante;
		this.tamannoDisco=tamannoDisco;
		//inicializamos los atributos que usamos para el control del tamaño y duración reales
		this.numActualCanciones=0;
		this.duracionReal=0;
		
		arrayCanciones=new Cancion[tamannoDisco];
		
		setCodigo();
	}
	private void setCodigo() {
		this.codigo="";
		if (this.titulo.length()<5) //si la longitud del título o nombre es inferior a lo pedido no hay substring
			this.codigo+=this.titulo;
		else this.codigo+=this.titulo.substring(0,5);
		if (cantante.getNombre().length()<4)
			this.codigo+=this.cantante.getNombre();
		else
			this.codigo+=this.cantante.getNombre().substring(0,4);
		this.codigo=this.codigo.toUpperCase();
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String nombre) {
		this.titulo = nombre;
		setCodigo(); //si cambia el título del disco, cambia el código
	}

	
	public Cantante getCantante() {
		return cantante;
	}
	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
		setCodigo(); //si cambia el cantante, cambia el código
		
	}
	public int tamannoDisco() {
		return tamannoDisco;
	}
	
	public int numActualCanciones(){
		return numActualCanciones;
	}

	public Cancion[] getArrayCanciones() {
		return arrayCanciones;
	}
	
	public double duracionDisco(){
		//si tenemos el atributo private double duracionReal que se actualiza 
		//cada vez que se inserte una canción 
		
		return duracionReal;
		
		//si no lo tenemos, recorremos todo el array: esto es mucho más lento
		
		/*double duracTotal=0;
		for (int i = 0; i < arrayCanciones.length; i++) {
			if (arrayCanciones[i]!=null)
				duracTotal+=arrayCanciones[i].getDuracion();			
		}
		return duracTotal;*/
	}
	
	

	public boolean annadir (Cancion cancion) {
	
		boolean alta=false;
		if (numActualCanciones==tamannoDisco) //no hay sitio
			System.out.println("Lo sentimos, ya se ha llenado el disco");
		else {
			
			
			//controlamos que no se exceda de la duración máxima

			if (duracionDisco()+cancion.getDuracion() > duracionMax )
				//tambien se podría preguntar (if (duracionReal+duracion > duracionMax)
				System.out.println("Lo sentimos, con esta canción se excede de la duración máxima");

			else {//buscamos el título de la canción en el array

				Cancion auxCancion=buscar(cancion.getTitulo());
				if (auxCancion!=null)
					System.out.println("Ya existe una cancion con ese título "+auxCancion.toString());
				else { //todo es correcto, damos de alta la canción y la insertamos					
					insertar(cancion);//se podría hacer todo aquí, solo lo he separado para meter los datos de prueba directamente
					alta=true; //si todo va bien devuelve true
				}

			}
		}
		return alta; //si falla algo devuelve falso
	}
	
	
	public void insertar(Cancion cancion){
		
		arrayCanciones[numActualCanciones]=cancion;
		//se inserta en la posición que indica el numActualCanciones (empieza en 0) y se incrementa después
		numActualCanciones++;
		duracionReal+=cancion.getDuracion();
		
		
	}

	public Cancion buscar(String titulo){		
		
		Cancion cancion=null;
		//Podríamos  hacer esto:
		/*for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]!=null && arrayCanciones[i].getTitulo().equalsIgnoreCase(titulo)){
				
				cancion=arrayCanciones[i];
				break;
			}*/
		//Mucho más rápido: recorrer solo hasta el numActualCanciones:
		
		for (int i=0; i<numActualCanciones; i++)
			if (arrayCanciones[i].getTitulo().equalsIgnoreCase(titulo)){				
				cancion=arrayCanciones[i];
				break;			
		}
			
		return cancion;
		
	}

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", nombre=" + titulo + ", cantante="
				+ cantante + ", numCanciones=" + tamannoDisco + ", numActual="
				+ numActualCanciones + ", arrayCanciones="
				+ Arrays.toString(arrayCanciones) + ", duracionTotal()="
				+ duracionDisco() + "]";
	}

	public void visualizarDisco(){		
		// Se podría hacer: System.out.println(this.toString());
		// O recorrer el array 
	
		System.out.println("Canciones del disco");
		
		//Podríamos hacer esto:
		/*for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]!=null){ 
				System.out.println(arrayCanciones[i].toString());
				duracionTotal+=arrayCanciones[i].getDuracion();
			}*/
			
		//Mucho más rápido:
		
		for (int i=0; i<numActualCanciones; i++){
			System.out.println(arrayCanciones[i].toString());			
		}
		
		System.out.println("Duracion total "+duracionReal);
			
	}
	
	public void obtenerCanciones (){
		System.out.println("Introduce duración de la cancion");		
		double duracion=LeerTeclado.readDouble();
		int cont=0;
		System.out.println("Visualizamos las canciones que superan esta duración");
		for (int i=0; i<numActualCanciones; i++)
			if (arrayCanciones[i].getDuracion()>duracion){				
				System.out.println(arrayCanciones[i].toString());
				cont++;					
		}
		System.out.println("En total hay "+cont+ " canciones ");
		
	}
	
	
	
}
