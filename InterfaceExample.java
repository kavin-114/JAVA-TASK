interface InterfaceOne{
	void printOne();
}
interface InterfaceTwo{
	void printTwo();
}
//Implementation: by second user
class InterfaceExample implements InterfaceOne,InterfaceTwo{
public void printOne(){System.out.println("Hello");}
public void printTwo(){System.out.println("Welcome");}

public static void main(String args[]){
InterfaceExample obj = new InterfaceExample();
obj.printOne();
obj.printTwo();
}
}