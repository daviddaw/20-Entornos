package paquete1;

public class Array {
	private int longitud;
	private int[] array;
	
	public Array (int longitud){
		this.longitud=longitud;
		array=new int[longitud];		
	}
	
	public Array(int[]array){
		this.longitud=array.length;
		this.array=array;
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void inicializar (){
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10);
		}
	}
	
	public int minimo(){
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<min)
				min=array[i];
		}
		return min;
	}
	
	public Array ordenar(){
		int [] arrayAux=this.getArray();
		int aux;
		for (int i=0; i<arrayAux.length-1; i++)
			for (int j=i+1; j<arrayAux.length; j++)
				if (arrayAux[i]>arrayAux[j]) // si la componente i es menor que la siguiente las intercambio 
				     {						
						aux=arrayAux[i]; //intercambio la componente i con la siguiente
						arrayAux[i]=arrayAux[j]; //siempre se usa una variables auxiliar para no perder los valores durante el cambio
						arrayAux[j]=aux;
					}
		
		
		return (new Array(arrayAux));
	}
	
	public Array invertir(){ //este metodo genera un objeto Array que contiene un array invertido
		Array inverso=new Array(this.longitud);//creo un objeto de la clase Array 
		//con la misma longitud que el atributo longitud
		for (int i=0; i<array.length; i++){
			inverso.array[this.longitud-1-i]=this.array[i]; //
		}
		return inverso;
		
	}
	
	public boolean buscar(int n){
		boolean enc=false;
		for (int i = 0; i < array.length; i++) {
			if (this.array[i]==n){
				enc=true;
				break;
			}			
		}
		return enc;
	}
	
	public boolean equals (Array otro){
		
		if (otro.longitud!=this.longitud)
			return false;
		for (int i = 0; i < array.length; i++) {
			if(this.array[i]!=otro.array[i])
				return false;
		}
		return true;
	}
	
	
	
	
}