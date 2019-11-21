package net.putfirstthingsfirst.threadSynchronization;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println(String.format("%s", Thread.currentThread().getName()));

			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
		System.out.println("Shudown completely !");
	}
}

public class App {

	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press any key to stop ...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();

		proc1.shutdown();
	}

}
