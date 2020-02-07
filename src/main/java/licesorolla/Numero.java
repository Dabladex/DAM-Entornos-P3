package main.java.licesorolla;

public class Numero {
	public static void calcularPrimo(int numeroP) {
		 boolean prime = true; 
		    for(int i = 2; i < numeroP; i++) {
		        if (numeroP % i == 0) {
		            prime = false;
		            break;
		        }
		    }
		    if (prime)
		       System.out.println("El numero es primo");
		    else
		       System.out.println("el numero no es primo");
	}
	
	public static void calcularFactorial(int numeroP) {
		int resultado=1;
		 for(int i = 1;i<=numeroP;i++) {
			 resultado = resultado * i;
		 }
		 
		 System.out.print("El factorial es "+resultado);
	}
	public static void main(String[] args) {
		
		int numeroP = 5;
		calcularPrimo(numeroP);
		calcularFactorial(numeroP);
	}

}
