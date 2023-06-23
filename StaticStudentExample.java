class StaticStudentExample{
	static int id;
	static String name;
	static String college = "KGM";
	StaticStudentExample(int i,String name){
	id = i;
	this.name = name;
	}
	static void display(){
	System.out.println(id+" "+name+" "+college);
	}
	public static void main(String args[]){
		StaticStudentExample s1 = new StaticStudentExample(11,"John");
		display();
		StaticStudentExample s2 = new StaticStudentExample(27,"Mouni");
		display();


	}
}