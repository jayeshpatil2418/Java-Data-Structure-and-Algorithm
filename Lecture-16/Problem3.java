import java.util.Scanner;

public class Problem3 {
    //Count the number of elements strictly greater than the value of x
    static void greaterElement(int arr[],int n){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(n<arr[i]){
                count++;
            }
        }
        System.out.println("The number of elements strictly greater than "+n+" in an array are : "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int arr[]={5,6,5,3,5,4};
        greaterElement(arr, n);
        sc.close();
        
    }
}
