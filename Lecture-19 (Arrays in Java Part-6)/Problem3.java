import java.util.Scanner;

public class Problem3 {
    /*Given an array of integers of size n. Answer q queries where you need to print the sum
of values in a given range of indices from 1 to r (both included).
Note: The values of 1 and r in queries follow 1-based indexing.*/
    public static int[] prefixSum(int arr[]){
        for(int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
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
        int pref[]=prefixSum(arr);
        System.out.println("Enter number of queries: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter Range: ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum =pref[end]-pref[start-1];
            System.out.println("Prefix Sum of Range: ");
            System.out.println(sum);
        }
        sc.close();
    }
}
