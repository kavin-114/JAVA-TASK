class Animal{
String color = "white";
}
class Dog extends Animal{
String color = "black";
void printColour(){
System.out.println(color); // prints color of dog class
System.out.println(super.color); //prints the super class color like animal color
}
}
class TestSuper1{
public static void main(String args[]){
Dog d = new Dog();
d.printColour();
}
}