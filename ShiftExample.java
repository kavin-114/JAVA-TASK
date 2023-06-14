import java.util.Scanner;
class ShiftExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your input value");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Left shifted value "+ (a<<b));
System.out.println("Right shifted value "+ (a>>b));
}
}
