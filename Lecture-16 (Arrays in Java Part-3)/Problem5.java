/*
 Problem 5: Given an array "a" consisting of integers. Return the first value that is repeating in this array.If no value is being repeated,return -1.
*/
import java.util.Scanner;
public class Problem5 {
    static int firstRepeatNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];   
                }
            }
        }
        return -1;  
        
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

        System.out.println("The First Repeating Number in the array is : "+firstRepeatNumber(arr));
        sc.close();
    }
}