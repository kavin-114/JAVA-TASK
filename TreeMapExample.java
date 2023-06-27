import java.util.*;

class TreeMapExample{

	public static void main(String args[]){	
		
		NavigableMap<String, String> map = new TreeMap<String, String>();
		map.put("101", "John");
		map.put("102", "Mouni");
		map.put("103", "Pavithra");
		map.put("104", "Pavithra");
		map.put("105", "Bharath");
		map.put("105", "Chandru");
		map.put("106", "");
		map.put("", "");
		map.put("", "Stephen");

System.out.println(map.descendingMap());
System.out.println(map.headMap("102", true));
System.out.println(map.tailMap("102", true));
System.out.println(map.subMap("102", true, "105", true));