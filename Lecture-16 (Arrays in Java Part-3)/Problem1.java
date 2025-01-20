/*
 Problem 1: To find the pair of the array elements who make up a target sum.4 6 3 5 8 2
*/
import java.util.Scanner;
public class Problem1 {
    static int pairSum(int arr[],int target){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(target==arr[i]+arr[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the "+n+" element of array:");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target=sc.nextInt();
        System.out.println("The Total Number of pair that make up target sum from the given array are : "+pairSum(arr, target));
        sc.close();
    }
}