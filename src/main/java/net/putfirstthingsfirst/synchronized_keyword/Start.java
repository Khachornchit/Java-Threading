package net.putfirstthingsfirst.synchronized_keyword;

public class Start {

	private int count = 0;
	
	// Used synchronized keyword to prevent the variable will be updated concurrency
	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) {
		Start app = new Start();
		app.doWork();
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			// t.join() will make sure that t is terminated before the next instruction is executed by the program
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(String.format("Count is : %s", count));
	}

}
