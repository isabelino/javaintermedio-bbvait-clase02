package com.ejemplo.excepcion;

public class Ejemplo8 {

	//multicatch
	public static void main(String[] args) {
		
		
		int a=28,b=0;
		int resultado;
		char chars[]= {'A','B','C'};
		
		for (int i = 0; i < 2; i++) {
			
			try {
				
				if(i==0) {
					resultado = a/b; //genera error 
				}else {
					chars[5]='X'; //generar un ArrayIndexOutOfBondsException
				}
				
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | ArrayStoreException exception) {
				System.out.println("Excepcion capturada" +exception);
			}
			
			System.out.println("Termina el codigo");
			
		}

	}

}
