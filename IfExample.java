import java.util.Scanner;
class IfExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your mark please: ");
int mark = sc.nextInt();
System.out.println("Executing grading process");
if((mark>=91) && (mark<=100)){
System.out.println("Your grade is A+");
}else if((mark>=76) && (mark<=90)){
System.out.println("Your grade is A");
}else if((mark>=36) && (mark<=75)){
System.out.println("Your grade is B");
}else{
System.out.println("You're fail. Please study well");
}
}
}
