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
	//esta variable indica cu�ntas canciones hay actualmente en el disco para ver si hay hueco
	//podr�amos tener tambi�n un atributo con la duraci�n real del Disco
	private double duracionReal;
	
	public Disco(String titulo, Cantante cantante, int tamannoDisco){
		
		this.titulo=titulo;
		this.cantante=cantante;
		this.tamannoDisco=tamannoDisco;
		//inicializamos los atributos que usamos para el control del tama�o y duraci�n reales
		this.numActualCanciones=0;
		this.duracionReal=0;
		
		arrayCanciones=new Cancion[tamannoDisco];
		
		setCodigo();
	}
	private void setCodigo() {
		this.codigo="";
		if (this.titulo.length()<5) //si la longitud del t�tulo o nombre es inferior a lo pedido no hay substring
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
		setCodigo(); //si cambia el t�tulo del disco, cambia el c�digo
	}

	
	public Cantante getCantante() {
		return cantante;
	}
	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
		setCodigo(); //si cambia el cantante, cambia el c�digo
		
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
		//cada vez que se inserte una canci�n 
		
		return duracionReal;
		
		//si no lo tenemos, recorremos todo el array: esto es mucho m�s lento
		
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
			
			
			//controlamos que no se exceda de la duraci�n m�xima

			if (duracionDisco()+cancion.getDuracion() > duracionMax )
				//tambien se podr�a preguntar (if (duracionReal+duracion > duracionMax)
				System.out.println("Lo sentimos, con esta canci�n se excede de la duraci�n m�xima");

			else {//buscamos el t�tulo de la canci�n en el array

				Cancion auxCancion=buscar(cancion.getTitulo());
				if (auxCancion!=null)
					System.out.println("Ya existe una cancion con ese t�tulo "+auxCancion.toString());
				else { //todo es correcto, damos de alta la canci�n y la insertamos					
					insertar(cancion);//se podr�a hacer todo aqu�, solo lo he separado para meter los datos de prueba directamente
					alta=true; //si todo va bien devuelve true
				}

			}
		}
		return alta; //si falla algo devuelve falso
	}
	
	
	public void insertar(Cancion cancion){
		
		arrayCanciones[numActualCanciones]=cancion;
		//se inserta en la posici�n que indica el numActualCanciones (empieza en 0) y se incrementa despu�s
		numActualCanciones++;
		duracionReal+=cancion.getDuracion();
		
		
	}

	public Cancion buscar(String titulo){		
		
		Cancion cancion=null;
		//Podr�amos  hacer esto:
		/*for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]!=null && arrayCanciones[i].getTitulo().equalsIgnoreCase(titulo)){
				
				cancion=arrayCanciones[i];
				break;
			}*/
		//Mucho m�s r�pido: recorrer solo hasta el numActualCanciones:
		
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
		// Se podr�a hacer: System.out.println(this.toString());
		// O recorrer el array 
	
		System.out.println("Canciones del disco");
		
		//Podr�amos hacer esto:
		/*for (int i=0; i<arrayCanciones.length; i++)
			if (arrayCanciones[i]!=null){ 
				System.out.println(arrayCanciones[i].toString());
				duracionTotal+=arrayCanciones[i].getDuracion();
			}*/
			
		//Mucho m�s r�pido:
		
		for (int i=0; i<numActualCanciones; i++){
			System.out.println(arrayCanciones[i].toString());			
		}
		
		System.out.println("Duracion total "+duracionReal);
			
	}
	
	public void obtenerCanciones (){
		System.out.println("Introduce duraci�n de la cancion");		
		double duracion=LeerTeclado.readDouble();
		int cont=0;
		System.out.println("Visualizamos las canciones que superan esta duraci�n");
		for (int i=0; i<numActualCanciones; i++)
			if (arrayCanciones[i].getDuracion()>duracion){				
				System.out.println(arrayCanciones[i].toString());
				cont++;					
		}
		System.out.println("En total hay "+cont+ " canciones ");
		
	}
	
	
	
}
