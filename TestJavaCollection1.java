import java.util.*;
class TestJavaCollection1{
public static void main(String args[]){

ArrayList<String> list = new ArrayList<String>(); //Creating arraylist

list.add("Ravi"); //Adding object in arraylist
list.add("Vijay");
list.add("Ravi");
list.add("Kavin");

//Traversing list through Iterator
Iterator itr = list.iterator();
while(itr.hasNext()){
    String element = (String) itr.next();
    System.out.println(element);
    if(element.equals("Kavin")){
        System.out.println(element+" is a Good Boy");
    }
}

}
    
}