package com.ejemplo.hilos;

public class Proceso1 extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			if(i == 3) {
				Thread.currentThread().stop();
			}
			
			System.out.println("Proceso 1");
			
			try {
				Thread.sleep(4000);
				
				Thread.currentThread().interrupt();
				Thread.currentThread().resume();
				
				
			} catch (InterruptedException e) {
				System.out.println("Hilo1 interrumpido");
			}
		}
		
	}
	
	

}
