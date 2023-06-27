import java.util.*;
class MapExample2{
	public static void main(String args[]){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"John");
		map.put(101,"Mouni");
		map.put(102,"Praveen");
		map.put(103,"Praveen");
		map.put(101,"Kavin");
		map.put(105,"");
		System.out.println(map);
		System.out.println(map.entrySet());
		//Elements can traverse in any order
		for(Map.Entry m:map.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}