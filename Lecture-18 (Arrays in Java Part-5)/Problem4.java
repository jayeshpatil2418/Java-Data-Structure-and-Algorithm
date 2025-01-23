import java.util.*;
public class Problem4 {
    /*Given an integer array 'a' sorted in non-decreasing
order, return an array of the squares of each number
sorted in non-decreasing order.*/


  static int[] sortSquares(int arr[]){
        int left=0;
        int right=arr.length-1;
        int ans[]=new int[arr.length];
        int k=arr.length-1;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                ans[k--]=arr[right]*arr[right];
                right--;
            }
            else{
                ans[k--]=arr[right]*arr[right];
                right--;;
            }
        }
        return ans;
    }

    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]= sortSquares(arr);
        System.out.println("Sorted Array: ");
        printArray(ans);
        sc.close();
    }
}



