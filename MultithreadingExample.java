class MultiA extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A with i = " + - i*i);
		}
		System.out.println("... Exiting from Thread A");
	}
}

class MultiB extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B with j = " +2* j);
		}
		System.out.println("... Exiting from Thread B");
	}
}

class MultiC extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread c with k = " +(2*k-1));
		}
		System.out.println("... Exiting from Thread C");
	}
}

public class MultithreadingExample {
	public static void main(String args[]) {
		MultiA a = new MultiA();
		MultiB b = new MultiB();
		MultiC c = new MultiC();
		a.start();
		b.start();
		c.start();
		System.out.println("... Multithreading is over ");
	}
}