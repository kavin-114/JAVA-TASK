class ClassA extends Thread {
	public void run() {
		System.out.println("Start Thread A...");
		for (int i = 0; i <= 5; i++) {
			if (i == 1)
				yield();
			System.out.println("From Thread A: i = " + i);
		}
		System.out.println("...Exit Thread A");
	}
}

class ClassB extends Thread {
	public void run() {
		System.out.println("Start Thread B...");
		for (int j = 0; j <= 5; j++) {
			System.out.println("From Thread B: j = " + j);
			if (j == 2)
				stop();
		}
		System.out.println("...Exit Thread B");
	}
}

class ClassC extends Thread {
	public void run() {
		System.out.println("Start Thread C...");
		for (int k = 0; k <= 5; k++) {
			System.out.println("From Thread B:j = " + k);
			if (k == 3) {
				try {
					sleep(2000);
				} catch (Exception e) {

				}
			}
		}
		System.out.println("...Exit Thread C");
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		ClassA t1 = new ClassA();
		ClassB t2 = new ClassB();
		ClassC t3 = new ClassC();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("...End of execution");
	}
}
