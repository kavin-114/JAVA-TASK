import java.util.Scanner;
class Factorial{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your value to find it's factorial: ");
int value = sc.nextInt(), sum = 1;
for(int i=1;i<=value;i++){
sum *= i;
}
System.out.println("The factorial value is "+ sum);
}
}