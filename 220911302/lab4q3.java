import java.util.Scanner;
public class lab4q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and colums");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter the matrix");
        for(int i = 0;i<r;i++)
        for(int j = 0;j<c;j++)
        arr[i][j] = sc.nextInt();
        int flag = 0;
        for(int i = 0;i<r;i++)
        for(int j = 0;j<c;j++){
            if(arr[i][j]!=arr[j][i]){
                flag = 1;
                break;
            }
            if(flag == 1) break;
        }
        if(flag == 1) System.out.println("not a symmetric matrix");
        else System.out.println(" symmetric matrix");
        

    }
    
}
