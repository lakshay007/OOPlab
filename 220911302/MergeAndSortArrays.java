import java.util.*;
public class MergeAndSortArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int s1 = sc.nextInt();
       int s2 = sc.nextInt();
       System.out.println("enter both the arrays");
       
        
        int[] array1 = new int[s1];
        int[] array2 = new int[s2];
        for(int i = 0 ;i<s1;i++){
            array1[i] = sc.nextInt();
        
        }
        for(int i = 0 ;i<s2;i++){
            array2[i] = sc.nextInt();
        
        }

      
        int mergedLength = array1.length + array2.length;

        
        int[] mergedArray = new int[mergedLength];

        
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

       
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

       
        for (int i = 0; i < mergedLength - 1; i++) {
            for (int j = 0; j < mergedLength - i - 1; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

      
        System.out.print("Merged and sorted array: ");
        for (int i = 0; i < mergedLength; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }
}