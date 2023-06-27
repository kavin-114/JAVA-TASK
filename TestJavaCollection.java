import java.util.*;
class TestJavaCollection{
	public static void main(String args[]){
		LinkedList<String> linkList = new LinkedList<String>();
		Vector<String> vectorList = new Vector<String>();
		Stack<String> stackList = new Stack<String>();
		HashSet<String> hashSet = new HashSet<String>();
		LinkedHashSet<String> linkHashSet = new LinkedHashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		
	    linkList.add("arun");
	    linkList.add("arun");
	    linkList.add(null);
	    System.out.println("Linked List "+linkList);
	    
	    vectorList.add("arun");
	    vectorList.add("arun");
	    vectorList.add(null);
	    System.out.println("vector "+linkList);
	    
	    stackList.add("arun");
	    stackList.add("arun");
	    stackList.add(null);
	    System.out.println("Stack "+stackList);
	    
	    hashSet.add("arun");
	    hashSet.add("arun");
	    hashSet.add(null);
	    System.out.println("Hash Set "+hashSet+" It does'nt allow duplicate values");
	    
	    linkHashSet.add("arun");
	    linkHashSet.add("arun");
	    linkHashSet.add(null);
	    System.out.println("linkHashSet "+linkHashSet+" It does'nt allow duplicate values");
	    
	    treeSet.add("arun");
	    treeSet.add("arun");
	    treeSet.add(null);
	    System.out.println("Tree Set "+treeSet+" It does'nt allow duplicate values and null elements");
	}
}