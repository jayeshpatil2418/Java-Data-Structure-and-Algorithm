import java.util.Scanner;
public class Problem8 {
    //Search if the element is present in the array or not.
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" element of array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] freq = makeFrequencyArray(arr);
        System.out.println("Enter the number of queries: ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter the number you want to search: ");
            int num =sc.nextInt();
            if(freq[num]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
        sc.close();
    }
}
