import java.util.Scanner;
class ArithmeticExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your input value");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("The Sum of two values "+ (a+b));
System.out.println("The Multiply of two values "+ (a*b));
System.out.println("The Substraction of two values "+ (a-b));
System.out.println("The Division of two values "+ (a/b));
System.out.println("The Modulus of two values "+ (a%b));
}
}