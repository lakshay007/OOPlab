import java.util.Scanner;
class Calculator{
public static void main(String args[]){
char y;
do{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number, an operator and another number");
float num1 = sc.nextInt();
char c = sc.next().charAt(0); 
float num2 = sc.nextInt();
float result = 0;
switch(c){
case('+'):
result = num1 + num2; break;
case('*'): 
result = num1 * num2; break;
case('/'):
result = num1/num2; break;
case('-'):
result = num1 - num2; break;}
System.out.println("the result is:" + result);
System.out.println("do you wish to continue?(yes/no)");
 y = sc.next().charAt(0); 
}
while(y == 'y');


}}