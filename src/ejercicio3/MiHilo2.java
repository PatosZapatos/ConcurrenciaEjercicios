package ejercicio3;

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
