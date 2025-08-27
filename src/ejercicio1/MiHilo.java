package ejercicio1;

//Pregunta para pensar: ¿Qué sucede si llamas a hilo.run() en lugar de hilo.start()? ¿Cuál es la diferencia?
/* Llamar run() ejecuta el código de forma directa, no crea un nuevo hilo. 
 * Llamar start() crea un nuevo hilo, y luego invoca run() en ese hilo.
* */


public class MiHilo extends Thread {

	public void run() {
		System.out.println("¡Hola desde mi hilo!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiHilo thr1 = new MiHilo();
		
		thr1.start();
		
	}

}
