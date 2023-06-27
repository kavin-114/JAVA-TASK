class A1{
	void msg(){
	System.out.println("Welcome...");
	}
}
class A2{
	void msg(){
	System.out.println("Helooo.....");
	}
}
class A3 extends A1,A2{
	public static void main(String args[]){
	A3.obj = new A3();
	obj.msg();
	}
}