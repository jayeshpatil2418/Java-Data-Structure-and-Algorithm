import java.util.Scanner;
public class Problem3 {
    //Search the given element x in the array.If present then return the index else return -1.
    void arraySearch(){
        int arr[]={1,5,6,3};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element which you want to search");
        int x = sc.nextInt();
        //int x = 3;
        for(int i =0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("The element is present at index : "+i);
                break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Problem3 obj = new Problem3();
        obj.arraySearch();
    }
}
