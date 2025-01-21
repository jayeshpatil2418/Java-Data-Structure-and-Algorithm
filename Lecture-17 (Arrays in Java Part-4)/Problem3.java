import java.util.Scanner;
class Problem3{
    //Reverse the Elements of array 
    static void reverseArray(int arr[]){
        int ans[]= new int[arr.length];
        int j=0;
        System.out.println("Elements of Array Before Reversing");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i =arr.length-1;i>=0;i--){
                ans[j++]=arr[i];
        }

        System.out.println("Elements of Array After Reversing");
        for(int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
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
        sc.close();
    }
}