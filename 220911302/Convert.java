import java.util.Scanner;
class Convert{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("enter a int, double and character:");
int i = input.nextInt();
double d = input.nextDouble();
char c = input.next().charAt(0);
byte b = (byte)i;
int c1 = (int)c;
byte b1 = (byte)d;
int d1 = (int)d;
System.out.println("int to byte is " + b + " char to int is " + c1 + " double to byte is " + b1 + " double to int is " + d1);

}
}