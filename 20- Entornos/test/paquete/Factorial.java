package paquete;
import paquete1.LeerTeclado;
public class Factorial {
	int num;	
	public Factorial(int num) {
		this.num = num;
	}
	public int calculo () throws Exception {
		int fact; 
		int i;
		
			if (num<0){
			//System.out.println("El n�mero no puede ser negativo");
			fact= -1;
			throw new Exception ("El n�mero no puede ser negativo");
			
		
		}	
		
		
		
		else if (num>15){
			//	System.out.println("El n�mero excede del rango");
			fact= -2;
			throw new Exception ("El n�mero excede del rango");
				
			}
			else {
				fact=1;i=1;
				while (i<=num){
					fact*=i;
					i++;
				}
			}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Introduce un n�mero para calcular el factorial");
		Factorial f=new Factorial(LeerTeclado.readInteger());
		try{
			System.out.println("factorial= "+f.calculo());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
