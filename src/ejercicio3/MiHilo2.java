package ejercicio3;

//Pregunta para pensar: ¿El orden de las salidas siempre es el mismo? ¿Por qué sí o por qué no?
/* No, el orden de las salidas no es siempre el mismo porque el planificador del sistema operativo/JVM 
 * decide el intercalado de ejecuciones (concurrency / preemption).
* */

public class MiHilo2 extends Thread {
	
	int id;
	
	public MiHilo2(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		
		MiHilo2[] threads = new MiHilo2[5];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MiHilo2(i+1);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
	}

	public void run() {	
		try {
			for (int i = 0; i < 5; i++) {
				String guion = "";
				for (int j = 0; j < id; j++) {
					guion += "-";
				}
				System.out.println(guion + id);
				sleep(100);
			}
		}
		catch(InterruptedException e) {
			return;
		}
	}
	
}
