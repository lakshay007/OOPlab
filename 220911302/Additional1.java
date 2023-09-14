import java.util.Scanner;
class Additional1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter two numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int e = (a<<2) + (b>>2);
int f = (b>0);
int g = (a+b*100)/10;
int h = a&b;
System.out.println(" operations are: " + e + " " + f+" " + g + " " + h);
}
}