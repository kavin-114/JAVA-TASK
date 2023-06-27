class TestStackCollection{
	public static void main(String args[]){
		Stack<String> list = new Stack<String>();
		list.push("Ravi");
		list.push("Ganesh");
		list.push("Hari");
		list.push("Krishna");
	System.out.println(list.size());
	System.out.println(list);
	System.out.println(list.get(1));
	System.out.println(list.contains("Ajith"));
	Collections.sort(list);
	System.out.println(list);
	System.out.println(list.isEmpty());
	list.removeAll(list);
	list.pop();
	
 	}
}