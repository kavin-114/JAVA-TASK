class CopyWithoutConstructor{
	int id;
	String name;
	Student7(int i,String n){
	id = i;
	name = n;
}
CopyWithoutConstructor(){}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
	CopyWithoutConstructor s1 = new CopyWithoutConstructor(111,"Karan");
	CopyWithoutConstructor s2 = new CopyWithoutConstructor();
	s2.name = s1.name;
	s1.display();
	s2.display();
}
}