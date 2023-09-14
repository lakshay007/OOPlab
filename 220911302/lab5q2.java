import java.util.Scanner;
class Employee{
String name, city; int salary;
float da, hra, calc;
void getdata(){
Scanner sc = new Scanner(System.in);
System.out.println("enter name:");
name = sc.nextLine();
System.out.println("enter city name:");
city = sc.nextLine();
System.out.println("enter salary:");
salary = sc.nextInt();
System.out.println("enter da:");
da = sc.nextFloat();
System.out.println("enter hra:");
hra = sc.nextFloat();
}
void calculate(){
calc = salary + (salary*da)/100 + (salary*hra)/100;
}
void display(){
System.out.println("the result is " + calc);
}

}
public class lab5q2 {
public static void main(String[] args) {
Employee obj = new Employee();
obj.getdata();
obj.calculate();
obj.display();

}
}