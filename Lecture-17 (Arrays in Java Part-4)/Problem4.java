import java.util.Scanner;
class Problem4{
    //Reverse the Elements of array using another method.
    static void swapInArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int arr[]){
        int i =0,j=arr.length-1;
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
        reverseArray(arr);
        printArray(arr);
        sc.close();
    }
}
