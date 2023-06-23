class B{
	A4 obj;
	B(A4 obj){
	this.obj = obj;
	}
	void display{
	Sytem.out.println(obj.data);
	}
}
class A4{
	int data = 10;
	A4(){
	B obj1 = new B(this);
	obj1.display();
	public static void main(String args[]){
	A4 obj2 = new A4();
	}
}