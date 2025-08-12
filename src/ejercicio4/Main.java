package ejercicio4;

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
			System.out.println("Valor Final: " + count.getValor()); 
		}
		
	}
	
}
