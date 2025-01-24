import java.util.Scanner;
public class Problem1 {
/*Given an integer array 'a', return the prefix sum/running sum in the same array without
creating a new array by creating new array.*/
    public static int[] prefixSum(int arr[]){
        int pref[]=new int[arr.length];
        pref[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prefix Sum Array: ");
        int pref[]=prefixSum(arr);
        printArray(pref);
        sc.close();
    }
}