package com.ejemplo.excepcion;

public class Ejemplo5 {

	static void generarExcepcion() {
		int numeros[]= new int[4];
		
		System.out.println("Antes de lanzar la excepcion");
		
		numeros[10]=10;
		
		System.out.println("Esto no debe verse");
	}
	
	public static void main(String[] args) {
		try {
			
			Ejemplo5.generarExcepcion();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mensaje estandar:");
			System.out.println(e);
			System.out.println("Traza de errores");
			e.printStackTrace();
			System.out.println("Descripcion de excepcion:");
			System.out.println(e.getMessage());
			System.out.println("Descripcion de localizada excepcion:");
			System.out.println(e.getLocalizedMessage());
		}
	}

}
