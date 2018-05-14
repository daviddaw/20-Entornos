package paquete;

public class Rectangulo {
	private Punto esquina1;//esquina inferior izda.
	private Punto esquina2;//esquina superior dcha.
	
	public Rectangulo(){
		Punto p1=new Punto(0,0);
		Punto p2=new Punto(1,1);
		esquina1=p1;
		esquina2=p2;
	}
	public Rectangulo(Punto a,Punto b){
		esquina1=a;
		esquina2=b;
	}
	public Rectangulo(Punto a, double ancho, double alto){
		esquina1=a;
		esquina2=new Punto(a.getX(),a.getY());
		// esquina2.desplazar (ancho, -alto); según se consideren los puntos 
		esquina2.desplazar(ancho,alto);
	}
	
	public double alto(){
		
		double x0=esquina1.getX();
		double y0=esquina2.getY();
		Punto p1=new Punto(x0,y0);
		double altura=esquina1.distancia(p1);
		return altura;
	}
	public double ancho(){
		Punto p2=new Punto(esquina1.getX(),esquina2.getY()); //equivale a lo anterior
		return esquina2.distancia(p2);
	}
	public double perimetro(){
		return ancho()*2+alto()*2;
	}
	public double area(){
		return ancho()*alto();
	}
	public void desplazar(double dx, double dy){ //desplaza un rectangulo desplazando sus esquinas
		esquina1.desplazar(dx, dy);
		esquina2.desplazar(dx, dy);
	}
	public void imprimir(){
		esquina1.imprimirP();
		esquina2.imprimirP();
	}
}
