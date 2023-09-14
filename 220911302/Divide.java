import java.util.Scanner;
class Divide{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number to divide and multiply by 2");
int n = sc.nextInt();
int m = n<<1;
int d = n>>1;
System.out.println("division is: " + d + " multiplication is " + m);


}
}