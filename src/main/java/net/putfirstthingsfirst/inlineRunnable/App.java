package net.putfirstthingsfirst.inlineRunnable;

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
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
		});
		
		t1.start();
	}

}
