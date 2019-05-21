package thread01.startThread02.runnable;

class Runner implements Runnable {
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

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());		
		Thread t2 = new Thread(new Runner());
		
		t1.start();
		t2.start();
	}

}
