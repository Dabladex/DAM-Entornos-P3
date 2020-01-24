package main.java.licesorolla;

public class Arrays {
	
	public static void calcularMedia(int[] array) {
		
		int total=0;
		int media=0;
		
		for(int i=0; i<array.length;i++) {
			
			total = total + array[i];
			
		}
		
		media = total / array.length;
		
		System.out.println(media);
		
	}

	public static void main(Cadenas[] args) {
		
		int[] array={1,3,4,2};
		
		calcularMedia(array);
		

	}
	

}
