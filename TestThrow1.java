public class TestThrow1{
//fucntion to check if person is eligible to vote or not
public static void validate(int age){
	if(age<18){
	//throw Arithmetic exception if not eligible to vote
	throw new ArithmeticException("Person is eligible to vote or not");
	}
	else {
	System.out.println("Person is eligible to vote !!");
	}
}
public static void main(String args[]){
	validate(16);
	System.out.println("rest of the code...");
}
}