package net.putfirstthingsfirst.runnable;

public class TaskRunable implements Runnable {

	String name;

	public TaskRunable(String name) {
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 1000; i++) {
			System.out.println(String.format("%s : %s", this.name, i));
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
