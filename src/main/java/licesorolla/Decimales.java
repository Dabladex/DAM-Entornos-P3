package main.java.licesorolla;

import java.text.DecimalFormat;

public class Decimales {
	public static void redondear (double numeroD) {
		
		DecimalFormat formateado = new DecimalFormat("0");
			
		System.out.print("El numero redondeado al alza es: ");
		System.out.println(formateado.format(Math.round(numeroD)));
			
	}

	public static void eliminarDecimal(int numeroD) {
		
		DecimalFormat formateado = new DecimalFormat("0");
			
		System.out.print("El numero redondeado sin decimales es: ");
		System.out.println(formateado.format(Math.round(numeroD)));
			
	}
	
	public static void main(String[] args) {
		
		double numeroD = 14.7;
	}

}
