import java.util.Scanner;
class Additional2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter 3 numbers");
int a , b , c;
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
int large = c>(a>b?a:b)?c:(a>b?a:b);
int small = c<(a<b?a:b)?c:(a<b?a:b);
System.out.println("the largest integer is: " + large + " the smallest integer is: " + small);
}
}