import java.io.*;
public class Test{
	public static void main(String args[]){
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\kavin\\OneDrive\\Desktop\\text.txt"));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\kavin\\OneDrive\\Desktop\\Copytext.txt"));
		String count;
		while((count = dis.readLine()) != null){
			String data = count.toUpperCase();
			System.out.println(data);
			dos.writeBytes(data+",");		}
		}
		dis.close();
		dos.close();
	}
}