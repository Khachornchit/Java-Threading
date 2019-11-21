package net.putfirstthingsfirst.thread;

public class Runner extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(String.format("%s %s", Thread.currentThread().getName(), i));

			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
