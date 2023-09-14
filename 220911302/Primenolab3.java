import java.util.Scanner;
public class Primenolab3 {
     static boolean isprime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println("enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            if(isprime(i)) System.out.print(i + " ");

        }
        
    }
}
