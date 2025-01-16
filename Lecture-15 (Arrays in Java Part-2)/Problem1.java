import java.util.Scanner;

public class Problem1 {
    //Count the number of occurences of particular element x in an array...
    static void elementOccurence(int arr[],int n){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
        }
        System.out.println("The Occurence of element "+n+" in an array is: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element whose occurence is to be found: ");
        int n = sc.nextInt();
        int arr[]={5,6,5,1,5};
        elementOccurence(arr, n);
        sc.close();
        
    }
}
