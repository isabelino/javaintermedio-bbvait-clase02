package com.ejemplo.excepcion;

public class Ejemplo2 {

	//ejemplo de try anidado
	public static void main(String[] args) {
			
		int numeros[]= {4,8,16,32,64,128,256,512};
		int denominador[]= {2,0,4,4,0,8};
		
		try {
			
			for (int i = 0; i < numeros.length; i++) {
				try {
					
						System.out.println(numeros[i] + " / " +denominador[i] +" es "+ numeros[i]/denominador[i]);
					
					
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero!");
				}
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error de array");
		}
		
	
	}

}
