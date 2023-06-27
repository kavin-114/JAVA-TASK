import java.util.*;
class TestLinkedList{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();
		list.add("Saii");
		list.add("Stephen");
		list.add("Mouni");
		list.add("John");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.set(1,"Kavin"));
		Collections.sort(list);
		System.out.println(list);

		list.removeAll(list);
		System.out.println(list.isEmpty());
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