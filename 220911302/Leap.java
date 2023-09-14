import java.util.Scanner;
class Leap{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("enter a year");
int year = input.nextInt();
boolean a ;
if(year%4!=0){a = false;}
else if(year%100!=0){a = true;}
else if(year%400!=0){a = false;}
else{a = true;}
if(a = true) System.out.println("it is a leap year");
else{System.out.println("it is not a leap year");}
}
}