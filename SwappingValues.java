import java.util.Scanner;
class SwappingValues{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your value for a: ");
int a = sc.nextInt();
System.out.println("Enter your value for b: ");
int b = sc.nextInt();
b = b+a;
a = b-a;
b = b-a;
System.out.println("The value of a is "+a);
System.out.println("The value of b is "+b);
;
}
}
