import java.util.Scanner;
class AssignmentExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your input value");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(a+=b);
System.out.println(a-=b);
System.out.println(a/=b);
System.out.println(a*=b);
System.out.println(a%=b);
}
}