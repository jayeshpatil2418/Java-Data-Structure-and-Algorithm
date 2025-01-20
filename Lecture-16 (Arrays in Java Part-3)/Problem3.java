/*
 Problem 3: Find the unique number in a given array where all the elements
are being repeated twice with one value being unique. 
*/
import java.util.Scanner;
public class Problem3 {
    static int uniqueNumber(int arr[]){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
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

        System.out.println("The Unique Number in the array is : "+uniqueNumber(arr));
        sc.close();
    }
}