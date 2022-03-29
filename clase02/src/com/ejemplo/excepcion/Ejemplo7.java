package com.ejemplo.excepcion;

import java.io.IOException;

public class Ejemplo7 {


	public static int[] prompt(int dato) throws ArrayIndexOutOfBoundsException {
			int[] num = new int[dato];
			num[5]=10;
			
		return num; 
		//System.out.println(dato + " :");
		//return (char) System.in.read();
	}
	
	
	public static void main(String[] args) {
		
		try {
			Ejemplo7.prompt(2);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		System.out.println("Termina el codigo");
		
		

		/*char ch;
		
		
		try {
			ch = prompt("Ingreso una letra");
		} catch (IOException e) {
			
			System.out.println("ocurrio una excepcion");
		}
			
	
		System.out.println("usted ingreso ch");*/
	}

}
