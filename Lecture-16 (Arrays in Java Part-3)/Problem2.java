/*
 Problem 2: To find the triplet of the array elements who make up a target sum. 
*/
import java.util.Scanner;
public class Problem2 {
    static int tripletSum(int arr[],int target){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(target==arr[i]+arr[j]+arr[k]){
                        ans++;
                    }
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
        System.out.println("The Total Number of triplet that make up target sum from the given array are : "+tripletSum(arr, target));
        sc.close();
    }
}