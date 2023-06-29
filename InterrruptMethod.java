
public class InterrruptMethod {
	public static void main(String args[]) {
		Thread th = new Thread();
		System.out.println("Numbers are printing line by line after 5 seconds: ");
		try {
			for(int i = 1;i <= 10; i++) {
				System.out.println(i);
				th.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted");
			e.printStackTrace();
		}
	}

}
