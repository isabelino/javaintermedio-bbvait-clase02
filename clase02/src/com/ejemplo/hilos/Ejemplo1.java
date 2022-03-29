package com.ejemplo.hilos;

import java.util.Iterator;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		Proceso1 hilo1 = new Proceso1();
		Thread hilo2 = new Thread(new Proceso2());
		Thread hilo2_1 = new Thread(new Proceso2());
		Thread hilo2_2 = new Thread(new Proceso2());
		Thread hilo2_3 = new Thread(new Proceso2());
		
		//indicador de ejecucion de hilo start()
		//hilo1.start();
		
				
		hilo2.start();
		hilo2_1.start();
		hilo2_2.start();
		hilo2_3.start();

		//stop() provoca que el hilo se detenga inmediatamente destruye el proceso
		//hilo1.stop();
		
		//suspend() provoca que se detenga el hilo sin destruirlo
		
		//resume() se utiliza para revivir a un hilo suspendido
		
		//sleep(long) provoca que un hilo se suspenda por un tiempo determinado en milisegundos
		
		
		

	}

}
