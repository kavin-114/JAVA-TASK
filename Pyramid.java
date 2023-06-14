import java.util.Scanner;
class Pyramid{
public static void main(String args[]){
String star = "";
for(int i=1;i<=5;i++){
//star += "*";
if(i==1){
System.out.println("    *   ");
}
if(i==2){
System.out.println("   *  *   ");
}
if(i==3){
System.out.println("  *  *  *  ");
}
if(i==4){
System.out.println(" *  *  *  * ");
}
if(i==5){
System.out.println("*  *  *  *  *");
}
}
}
}