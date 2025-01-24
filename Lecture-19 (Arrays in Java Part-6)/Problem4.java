import java.util.Scanner;

public class Problem4 {
    /*Program to check if an array can be partitioned into sub array with equal sum.*/
    public static int totalSum(int arr[]){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    public static boolean isPartitioned (int arr[]){
        int totalSum=totalSum(arr);
        int prefsum=0;
        for(int i =0;i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum=totalSum-prefsum;
            if(prefsum==suffixsum){
                return true;
            }
        }
        return false;
    }

    // public static void printArray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array: ");
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal Partition possible: "+isPartitioned(arr));
        sc.close();
    }
}
