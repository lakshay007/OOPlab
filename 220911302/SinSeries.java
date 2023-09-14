import java.util.Scanner;

public class SinSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the number of terms in the series: ");
        int n = scanner.nextInt();
        
        double result = 0;
        int sign = 1;
        
        for (int i = 1; i <= n; i += 2) {
            double term = Math.pow(x, i) / factorial(i);
            result += sign * term;
            sign = -sign; 
        }
        
        System.out.println("sin(" + x + ") = " + result);
    }
    
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

 

 