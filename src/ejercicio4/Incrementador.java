package ejercicio4;

public class Incrementador extends Thread {
	
	private Contador contador;
	
	public Incrementador(Contador contador) {
		this.contador = contador;
	}
	
	public void run() {
		for (int i = 0; i<1000; i++) {
			contador.incrementar();
		}
	}
}
