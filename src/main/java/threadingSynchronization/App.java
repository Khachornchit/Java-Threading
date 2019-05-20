package threadingSynchronization;

public class App {

	public static void main(String[] args) {
		Sequence sequence = new Sequence();

		Worker worker1 = new Worker(sequence);
		Worker worker2 = new Worker(sequence);
		
		worker1.start();
		worker2.start();
	}

}