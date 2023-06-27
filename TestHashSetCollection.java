import java.util.*;
public static TestHashSetCollection{
	public static void main(String args[]){
		HashSet<String> obj = new HashSet<String>();
		obj.add("Ravi");
		obj.add("Vidhya");
		obj.add("Pojitha");
		obj.add("Raj");
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.set(2,"Swathi"));
		System.out.println(obj.contains("Raj"));
		System.out.println(obj.isEmpty());


		
	}
}