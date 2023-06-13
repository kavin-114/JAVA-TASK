import java.util.Scanner;
class ScannerExample{
public static void main(String args[]){
System.out.println("Enter your name: ");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
System.out.println("Your name is " + name);
System.out.println("Enter your Integer Value: ");
int integer_value = sc.nextInt();
System.out.println("Your Integer Value is " + integer_value);
System.out.println("Enter your Short Value: ");
short short_value = sc.nextShort();
System.out.println("Your Short Value is " + short_value);
System.out.println("Enter your Long Value: ");
long long_value = sc.nextLong();
System.out.println("Your Long Value is " + long_value);
System.out.println("Enter your Float Value: ");
float float_value = sc.nextFloat();
System.out.println("Your Float Value is " + float_value);
System.out.println("Enter your Double Value: ");
double double_value = sc.nextDouble();
System.out.println("Your Double Value is " + double_value);
System.out.println("Enter your Byte Value: ");
byte byte_value = sc.nextByte();
System.out.println("Your Byte Value is " + byte_value);
System.out.println("Enter your Boolean Value: ");
boolean bool_value = sc.nextBoolean();
System.out.println("Your bool Value is " + bool_value);

System.out.println("Enter your Initial: ");
char char_value = sc.next().charAt(0);
System.out.println("Your bool Value is " + char_value);

}
}