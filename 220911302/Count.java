import java.util.Scanner;
class Count{
public static void main(String args[]){
int arr[] = new int[10];
Scanner input = new Scanner(System.in);
int pos = 0; int neg = 0; int zero = 0;
for(int i = 0;i<10;i++){
int n = input.nextInt();
if(n == 0) zero++;
if(n<0) neg++;
if(n>0) pos++;

}
System.out.println("you have entered " + zero + " zeros " + neg + " negatives " + pos + " positive numbers ");


}
}