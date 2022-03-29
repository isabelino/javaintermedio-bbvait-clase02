package com.ejemplo.excepcion;

import java.util.Iterator;

public class Ejemplo6 {

	public static void generarExcepcion(int rec) {
		int t;
		int numeros[]= new int[2];
		System.out.println("Recibiendo"+rec);
		try {
			switch (rec) {
				case 0: 
					t=10/rec;
				break;
				
				case 1: 
					numeros[4]=4;//genera error de indexacion
				break;
				
				case 2: 		
					return; //retornar desde el bloque
			
			}
		} catch (ArithmeticException e) {
			System.out.println("no se puede dividir por cero");
			//return;//retornaria al catch 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Elemento no encontrado");
		}finally {
			//esto se ejecuta al salir de los bloques try/catch
			System.out.println("Saliendo del try");
		}
	}
	public static void main(String[] args) {
	  
		for (int i = 0; i < 3; i++) {
			Ejemplo6.generarExcepcion(i);
			System.out.println();
		}
		
	}

}
