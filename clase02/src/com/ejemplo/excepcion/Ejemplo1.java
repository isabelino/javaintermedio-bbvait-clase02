package com.ejemplo.excepcion;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int numeros[] = new int[4];
		
		
		try{
			System.out.println("Antes de que genere la excepcion ");
			//bloque de codigo a monitorizar
			//numeros[10]=10;
			ExcEjemplo.generarExcepcion();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Indice fuera de los limites!");
				
		}catch (Exception e) {
			
			System.out.print("Error!");		
		}
		
		System.out.println("Despues del error");

	}

}
