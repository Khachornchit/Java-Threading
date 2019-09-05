package thread0101.thread;

class Runner extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print(String.format("%s %s", Thread.currentThread().getName(), i));

			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {

	public static void main(String[] args) {		
		Runner runner1 = new Runner();
		runner1.start();

		Runner runner2 = new Runner();
		runner2.start();
		
		Runner runner3 = new Runner();
		runner3.start();
	}

}