import java.util.Scanner;
class LogicalExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your input value");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(a>b && a>10);
System.out.println(a<b || a>b);
System.out.println(a!=b);
}
}
