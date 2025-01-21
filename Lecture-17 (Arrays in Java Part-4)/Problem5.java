import java.util.Scanner;
class Problem5{
    //Rotate the element of array by k input of rotation(Right Rotation).
    static int[] rotateArray(int arr[],int k){
        k=k%arr.length;
        int j=0;
        int ans[] =  new int[arr.length];
        for(int i=arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<arr.length-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
        
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
        System.out.println("Enter times you want to rotate array: ");
        int k=sc.nextInt();
        int ans[]=rotateArray(arr,k);
        printArray(ans);
        sc.close();
    }
}
