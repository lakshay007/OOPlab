import java.util.Scanner;
public class lab4q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and colums");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int add[][] = new int[r][c];
        System.out.println("enter matrix 1");
        for(int i = 0;i<r;i++)
        for(int j = 0;j<c;j++)
        arr[i][j] = sc.nextInt();
        System.out.println("enter matrix 2");
        for(int i = 0;i<r;i++)
        for(int j = 0;j<c;j++)
        arr2[i][j] = sc.nextInt();
        int mul[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                mul[i][j] = 0;
                for(int k = 0;k<c;k++){
                    mul[i][j] += arr[i][k]* arr2[k][j];
                }
            }
        }
        
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                add[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("the multiplication matrix is: ");
        for(int i = 0;i<r;i++){
        for(int j = 0;j<c;j++){
            System.out.print(mul[i][j] + " ");
        }
    System.out.println();
    }
    System.out.println("the addtition matrix is: ");
    for(int i = 0;i<r;i++){
        for(int j = 0;j<c;j++){
            System.out.print(add[i][j] + " ");
        }
    System.out.println();
    }


        
    }
    
}
