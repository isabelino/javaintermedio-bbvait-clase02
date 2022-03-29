package com.ejemplo.excepcion;

public class Ejemplo4 {
//ejemplo para relanzar una excepcion
	public static void main(String[] args) {
		
		try {
			
			Ejemplo4.generarExcepcion();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error - Programa terminado");
		}

	}
	
	public static void generarExcepcion() {
		int numeros[]= {4,8,16,32,64,128,256,512};
		int denominador[]= {2,0,4,4,0,8};
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			
			try {
				System.out.println(numeros[i] + " / " +denominador[i] +" es "+ numeros[i]/denominador[i]);
				
			} catch (ArithmeticException e) {
				
				System.out.println("No se puede dividir por cero");
				
			} catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("No se encuentra el elemento");
				throw exc;//relanzando excepcion
				
			}
		}
		
	}

}
