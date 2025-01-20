import java.util.Scanner;
import java.util.Arrays;
public class Problem5 {
 //Return the smallest and the largest element of the array.

 static int[] smallestAndLargestElement(int arr[]){
    Arrays.sort(arr);
    int ans[]={arr[0],arr[arr.length-1]};
    return ans;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" elements of array: ");

        int arr[]=new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();    
        }
        
        int ans[]=smallestAndLargestElement(arr);
        System.out.println("Smallest Element: "+ans[0]);
        System.out.println("Largest Element: "+ans[1]);
        sc.close();
        
    }   
}
