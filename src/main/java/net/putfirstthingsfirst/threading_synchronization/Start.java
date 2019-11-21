package net.putfirstthingsfirst.threading_synchronization;

public class Start {

	public static void main(String[] args) {
		Sequence sequence = new Sequence();

		Worker worker1 = new Worker(sequence);
		Worker worker2 = new Worker(sequence);
		
		worker1.start();
		worker2.start();
	}

}