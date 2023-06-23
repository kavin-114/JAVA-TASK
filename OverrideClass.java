interface MyMethod{
void myMethod();
}
class OverrideClass implements MyMethod{
public void myMethod(){
System.out.println("Method has been overridden");
}
public static void main(String args[]){
new OverrideClass().myMethod();


//OverrideClass obj = new OverrideClass();
//obj.myMethod();
}
}
