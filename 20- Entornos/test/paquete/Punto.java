package paquete;

public class Punto {
	private double x,y;
	
	public Punto(){
		x=0;
		y=0;
	}
	public Punto(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double distancia(Punto otro){
		 double dist=Math.sqrt(Math.pow(this.x-otro.x,2)+Math.pow(this.y-otro.y,2));
		return dist;
	}
	
	//desplazar es un método sobreescrito con dos definiciones: la primera desplaza las coordenadas del punto en una cantidad fija
	public void desplazar (double d){
		this.x+=d;
		this.y+=d;
	}
	//la segunda versión del método desplaza el punto en una cantidad distinta para las coordenadas x e y
	public void desplazar(double dx, double dy){
		this.x+=dx;
		this.y+=dy;
	}
	
	
	
	public void imprimirP(){
		System.out.println("(" + getX() +", " + getY() + ")");
	}
	//añadimos el método equals sobreescrito para evaluar que dos puntos son iguales si tienen las mismas coordenadas
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Punto))
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	
	
}
