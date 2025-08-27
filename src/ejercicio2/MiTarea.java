package ejercicio2;

//Pregunta para pensar: ¿Cuál es la principal ventaja de usar Runnable en lugar de extender Thread?
/* Runnable permite separar la tarea del hilo, reutilizar la misma tarea en distintos hilos/ejecutores, 
* y evitar algunos problemas que trae la herencia, como el no poder tener más de una superclase.
* */

public class MiTarea implements Runnable{

	public static void main(String[] args) {
		MiTarea tarea = new MiTarea();
		Thread thr1 = new Thread(tarea);
		thr1.start();
	}

	@Override
	public void run() {
		System.out.println("¡Hola desde mi tarea con Runnable!");
	}

}
