class ReturnThisExample{
	void m(){
	System.out.println(this); //prints same reference ID
	}
	public static void main(String args[]){
	ReturnThisExample obj = new ReturnThisExample();
	System.out.println(obj);
	obj.m();
	}	
}