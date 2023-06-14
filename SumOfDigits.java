import java.util.Scanner;
class SumOfDigits{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your value to find it's Sum: ");
int value = sc.nextInt(), sum = 0;
for(int i=1;i<=value;i++){
sum += i;
}
System.out.println("The sum of value is "+ sum);
}
}