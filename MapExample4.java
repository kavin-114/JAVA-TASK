import java.util.*;
class MapExample4{
	public static void main(String args[]){
		Map<String,String> map = new HashMap<String,String>();
		map.put("name","Stephen");
		map.put(" asdsd","vijay");
		map.put("","Rahul");
		//map.remove(102);
		//Returns a set view of the mappings contained in this map
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//Returns a sequential Stream with this collection as its source
		//Sorted acording to the provided comparator
		//Performs an action for each element of this stream
		
	}
}