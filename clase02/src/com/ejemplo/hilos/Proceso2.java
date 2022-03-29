package com.ejemplo.hilos;

public class Proceso2 implements Runnable{

	@Override
	public void run() {
		for (int y = 0; y < 3; y++) {
			System.out.println("Proceso 2");
		}
		System.out.println();
		
	}

	

}
