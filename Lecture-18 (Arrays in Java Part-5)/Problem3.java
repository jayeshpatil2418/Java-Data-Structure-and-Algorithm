import java.util.Scanner;

public class Problem3 {
/*Given an array of integers 'a', move all the even integers at the
  beginning of the array followed by all the odd integers. The 
  relative order of odd or even integers does not matter. Return
  any array that satisfies the condition.*/
  static void sortEvenAndOdd(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
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
        sortEvenAndOdd(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
        sc.close();
    }
}

