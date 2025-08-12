package ejercicio2;

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
