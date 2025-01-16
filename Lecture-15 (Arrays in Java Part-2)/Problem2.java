import java.util.Scanner;

public class Problem2 {
    //Find the last occurence of an element x in an array...
    static void elementLastOccurence(int arr[],int n){
        int index =-1;
        for(int i =0;i<arr.length;i++){
            if(n==arr[i]){
                index=i;
            }
        }
        System.out.println("The Last occurence of element "+n+" in an array is at index : "+index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element whose last occurence is to be found: ");
        int n = sc.nextInt();
        int arr[]={5,6,5,3,5,4};
        elementLastOccurence(arr, n);
        sc.close();
        
    }
}
