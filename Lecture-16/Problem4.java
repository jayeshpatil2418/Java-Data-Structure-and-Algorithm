import java.util.Scanner;

public class Problem4 {
 //Check if the given array is sorted or not.
 static boolean sortedArray(int arr[]){
        boolean check = true;
        for(int i =1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                check = false;
                break;
            }
        }
        return check;
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
        System.out.println("Is sorted: "+sortedArray(arr));
        sc.close();
        
    }   
}
