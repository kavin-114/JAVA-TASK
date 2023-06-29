class TableS {
	synchronized void printTable(int n) {
		// method synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1Sync extends Thread {
	Table t;

	MyThread1Sync(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2Sync extends Thread {
	Table t;

	MyThread2Sync(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class Synchronization {
	public static void main(String args[]) {
		Table obj = new Table();
		MyThread1Sync t1 = new MyThread1Sync(obj);
		MyThread2Sync t2 = new MyThread2Sync(obj);
		t1.start();
		t2.start();
	}
}

