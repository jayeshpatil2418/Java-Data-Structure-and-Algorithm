import java.util.Scanner;
import java.util.Arrays;
public class Problem6 {
 //Return Kth the smallest and the largest element of the array.

 static int[] kthSmallestAndLargestElement(int arr[],int p,int q){
    Arrays.sort(arr);
    int ans[]={arr[p-1],arr[arr.length-q]};
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
        System.out.println("Enter the kth smallest element want: ");
        int p =sc.nextInt();
        System.out.println("Enter the kth largest element want: ");
        int q =sc.nextInt();
        
        int ans[]= kthSmallestAndLargestElement(arr,p,q);
        System.out.println(p+"th Smallest Element: "+ans[0]);
        System.out.println(q+"th Largest Element: "+ans[1]);
        sc.close();
        
    }   
}
