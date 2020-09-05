package java.exemplos;

public class ExemploThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread 1");
			}
		});
		t1.start();
		
		//utilizando lambda expressions
		Thread t2 = new Thread(
			() -> System.out.println("Thread 2")
		);
		t2.start();

	}

}
