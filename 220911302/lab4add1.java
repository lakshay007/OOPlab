import java.util.Scanner;
public class lab4add1 {
   static boolean isprime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("prime numbers are:");
        for(int i = 0;i<n;i++){
            if(isprime(arr[i])) System.out.print(arr[i] + " ");
        }
        


    }
    
}
