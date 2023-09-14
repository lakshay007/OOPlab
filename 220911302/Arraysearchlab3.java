import java.util.Scanner;
public class Arraysearchlab3 {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,1,5,6,7};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int i = 0;
        for( i = 0;i<9;i++){
            if(a[i] == n) {System.out.println("the element was found at " + (i+1)); 
            flag = 1;}
        }
        if(flag==0) System.out.println("not found");

    }
}
