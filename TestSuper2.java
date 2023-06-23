class Animal{

Animal(){
System.out.println("calling parent constructor");
}
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
Dog(){
super();
}
void eat(){
System.out.println("eating bread...");
}
void bark(){
System.out.println("barking...");
}
void work(){
eat();
bark();
}
}
class TestSuper2{
public static void main(String args[]){
Dog d = new Dog();
d.work();
d.eat();

}
}