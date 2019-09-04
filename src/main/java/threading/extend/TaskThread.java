package threading.extend;

public class TaskThread extends Thread {

	String name;

	public TaskThread(String name) {
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
