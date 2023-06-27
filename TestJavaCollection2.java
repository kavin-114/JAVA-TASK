import java.util.*;
class TestJavaCollection2{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Vijay");
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
	
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
			String name = itr.next();
			if(name.equals("Vijay")){
				System.out.println(name + "is good boy");
			}
		}
	}
}