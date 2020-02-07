package main.java.licesorolla;

public class Arrays {
	
		public static int mediana( int []array ) {
			int middle = array.length/2;
		    if (array.length%2 == 1) {
		        return array[middle];
		    } else {
		        return (int) ((array[middle-1] + array[middle]) / 2.0);
		    }
		}
		
	public static void calcularMedia(int[] array) {
		
		int total=0;
		int media=0;
		
		for(int i=0; i<array.length;i++) {
			
			total = total + array[i];
			
		}
		
		media = total / array.length;
		
		System.out.println(media);
		
	}
	public static void calcularMinimo (int[] array) {
		int numeroMin=999;
		
		for(int i=0; i<array.length; i++) {
				
			if(array[i] < numeroMin){
				numeroMin=array[i];
			}
			
		}
		System.out.println("El minimo valor es: "+numeroMin);
	}
	
	public static void main(String[] args) {
			
		int[] array={1,3,4,2};
		
		calcularMedia(array);
		mediana(array);

	}

}
