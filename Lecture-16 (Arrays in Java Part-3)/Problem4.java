/*
 Problem 4: Find the second largest element in a given array. 
*/
import java.util.Scanner;
public class Problem4 {
    static int findMaxNumber(int arr[]){
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        return max;
    }

    static int findSecMax(int arr[]){
        int max = findMaxNumber(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secmax=findMaxNumber(arr);
        return secmax;
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

        System.out.println("The Second Maximum Number in the array is : "+findSecMax(arr));
        sc.close();
    }
}