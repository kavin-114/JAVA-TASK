import java.io.*;
public class CreateDirectory{
	public static void main(String args[]){
	String dir = "C:/Users/kavin/OneDrive/Desktop/Files";
	File f = new File(dir);
	f.mkdirs();
}
}