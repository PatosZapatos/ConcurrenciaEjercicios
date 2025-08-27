package ejercicio4;

// Pregunta para pensar: ¿Por qué synchronized resuelve el problema? ¿Qué es lo que bloquea exactamente?
/* Synchronized se encarga de hacer que solo un hilo ejecute su bloque de código o método sincronizado a la vez,
 * evitando interferencias entre multiples hilos.
 * Al aplicarse sobre un método, se obtiene un bloqueo sobre el objeto especificado, bloqueando acceso a otros hilos hasta
 * liberar el bloqueo.
 * */

public class Main {

	public static void main(String[] args) throws InterruptedException { 
		
		Contador count = new Contador(); 
		Incrementador[] threads = new Incrementador[5]; 
		
		for (int i = 0; i < threads.length; i++) { 
			threads[i] = new Incrementador(count); 
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) { 
			threads[i].join();  	
		}
		System.out.println("Valor Final: " + count.getValor());
		
	}
	
}
