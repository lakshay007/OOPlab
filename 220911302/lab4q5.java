import java.util.Scanner;
public class lab4q5 {
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
        int diagsum = 0;
        for(int i = 0;i<r;i++)
        diagsum += arr[i][i];
        for(int i = 0;i<r;i++){
            int sum = 0;
        for(int j = 0;j<c;j++){
            sum+= arr[i][j];

        }
        if(sum!=diagsum){
            flag =1 ; break;
        }
    }
    for(int i = 0;i<c;i++){
        int sum = 0;
    for(int j = 0;j<r;j++){
        sum+= arr[j][i];

    }
    if(sum!=diagsum){
        flag =1 ; break;
    }
}
int diagsum2 = 0;
for(int i = 0;i<r;i++){
    for(int j = 0;j<c;j++){
        if(i+j!= (r)-1) continue;
        diagsum2 += arr[i][j];
    }
}
if(diagsum2!= diagsum ) flag = 1;
if(flag == 1) {
    System.out.println("not magic square");
}
else
System.out.println("magic square!!!");



        
    }
}
