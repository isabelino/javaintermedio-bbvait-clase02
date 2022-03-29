package com.ejemplo.excepcion;

public class Ejemplo3 {

	public static void main(String[] args) {

		
		try {
			
			System.out.println("Antes de lanzar la excepcion");
			throw new ArithmeticException();
			
		} catch (ArithmeticException e) {
			System.out.println("Excepcion controlada");
		}
		
		System.out.println("Despues del bloque try/catch");
		
	}

}
