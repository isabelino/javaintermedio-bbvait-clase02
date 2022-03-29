package com.ejemplo.excepcion;

public class ExcEjemplo {

	public static void generarExcepcion() {
		int numeros[] = new int[4];
		System.out.println("Antes de que se genere la excepcion Subclase");
		
		numeros[7]=10;
		System.out.println("Esto no deberia verse Subclase");
	}
}
