package ejercicio1;

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
