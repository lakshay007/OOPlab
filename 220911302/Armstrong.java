import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int temp = n;
        int res = 0;
        while(n!=0){
            res += (n%10)*(n%10)*(n%10);
            n/=10;
        }
        if(res==temp) System.out.println("armstrong number");
        else System.out.println("not an armstrong number");
    }
}