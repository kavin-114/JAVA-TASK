interface MyMethod{
public void myMethod();
}
class OverloadingClass implements MyMethod{
public void myMethod(){
System.out.println("Method has been overridden");
}
public static void myMethod(){
System.out.println("Method has been overloaded"+i);
}
public static void main(String args[]){
new OverloadingClass().myMethod();
myMethod();
}
}