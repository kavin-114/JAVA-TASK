class TestOverloading4{
public static void main(String[] args){
System.out.println("main with String[]");
TestOverloading4.main("String args");
TestOverloading4.main();

}
public static void main(String args){
System.out.println("main with String");
}
public static void main(){
System.out.println("main without args");
}
}