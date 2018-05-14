package paquete;

public class Principal {
	public static void main(String[]args){
		Punto p1=new Punto(2,3);
		Punto p2=new Punto(2,3);
		Punto p3=new Punto(5,5);
		Punto p4=new Punto();
		System.out.println("Punto 1");
		p1.imprimirP();
		System.out.println("Punto 2");
		p2.imprimirP();
		System.out.println("Punto 3");
		p3.imprimirP();
		System.out.println("Punto 4");
		p4.imprimirP();
		System.out.println("Distancia de p1 a p2 " + p1.distancia(p2));
		System.out.println("Distancia de p3 a p1 " + p3.distancia(p1));
		System.out.println("Distancia de p1 a p3 " + p1.distancia(p3));
		System.out.println("Distancia de p3 a p4 " + p3.distancia(p4));
		
		System.out.println();
		
		System.out.println("Creamos un rectangulo con los puntos p1 y p3");	
		Rectangulo r1=new Rectangulo(p1,p3);
		r1.imprimir();
		System.out.println("Base= "+r1.ancho());
		System.out.println("Altura= "+r1.alto());
		System.out.println("Area= " + r1.area());
		System.out.println("Perimetro= " + r1.perimetro());
		
		System.out.println("Creamos otro rectangulo con lo valores por defecto");
		Rectangulo r2=new Rectangulo ();
		r2.imprimir();
		
		System.out.println("Creamos otro rectangulo con el punto 3, base 2 y altura 4");
		Rectangulo r3=new Rectangulo (p3,2,4);
		r3.imprimir();
		
		System.out.println("Desplazamos el rectangulo 1 en 4 posiciones");
		System.out.println("Rectangulo antes del deplazamiento");
		r1.imprimir();
		
		r1.desplazar(4,4);
		
		System.out.println("Rectangulo después del deplazamiento");
		r1.imprimir();
		System.out.println("Base= "+r1.ancho());
		System.out.println("Altura= "+r1.alto());
		System.out.println("Area= " + r1.area());
		System.out.println("Perimetro= " + r1.perimetro());
		
		
	}
}
