import java.util.Scanner;

class SwitchExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your rating for Soorarai Potru movie (1-5): ");
int rating = sc.nextInt();
switch(rating){
case 1:
System.out.println("Oops! We'll try to improve :(");
break;
case 2:
System.out.println("Ohho! Thanks, we'll get back in a healthy");
break;
case 3:
System.out.println("Nothing but average, thanks!");
break;
case 4:
System.out.println("Thanks for your support, love!");
break;
case 5:
System.out.println("Hooray! We could ask for nothing :)");
break;

default:
System.out.println("Try to rate from 1-5, thanks!");
}

}
}
