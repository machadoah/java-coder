package g_lambdas.i_Thread;

public class Threads {
	
	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho1();
		Runnable t2 = new Runnable() { // instanciando uma insterface, gerando uma classe anonima
			
			@Override
			public void run() { // classe anonima
				for (int i = 0; i < 10; i++) {
					System.out.println("trabalho #02");
				}
				
			}
		};
		
		// Usando lambda como thread
		Runnable t3 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("trabalho #03");
			}
		};
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
