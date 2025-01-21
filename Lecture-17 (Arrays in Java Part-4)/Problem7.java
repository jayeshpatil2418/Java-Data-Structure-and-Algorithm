import java.util.Scanner;
class Problem7{
    //Rotate the element of array by k input of rotation(Right Rotation without extra spaces).
    static void rotateInPlace(int [] arr,int k){
        int n = arr.length;
        k=k%n;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swapInArray(int arr[],int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int arr[],int i,int j){
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" element of array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter times you want to rotate array: ");
        int k=sc.nextInt();
        rotateInPlace(arr,k);
        printArray(arr);
        sc.close();
    }
}
