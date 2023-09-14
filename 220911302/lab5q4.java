import java.util.Scanner;
class Complex{
int a1,a2,c1,c2;
void add(int a,int c1,int c2){
this.a1 = a;
this.c1 = c1;
this.c2 = c2;
int res = a + c1;
System.out.println("the result is :" + res +"+" + c2 + "i" );
}
void add(int a, int b, int c ,int d){
a1 = a;
a2 = b;
c1 = c;
c2 = d;
int res1 = a1 + c1;
int res2 = a2 + c2;
System.out.println("the result is :" + res1 + "+" + res2 + "i" );
}
}
public class lab5q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Complex obj = new Complex();
obj.add(2,3,4,5);
}
}