import java.util.Scanner;
public class MatricesMultiplication {

    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
     public static void multiply(int arr[][],int r1,int c1,int arr2[][],int r2,int c2){
            if(c1!=r2){
                System.out.println("Wrong Dimension - Multiplication Not Possible");
                return;
            }
            int mul[][]=new int[r1][c2];
            for(int i=0;i<r1;i++ ){
                for(int j =0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        mul[i][j]+=arr[i][k]*arr2[k][j];
                    }
                    
                }
            }
            printArray(mul);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrix 1");
        int r1 = sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1]; //total elements = r*c
        System.out.println("Enter "+r1*c1+" elements");
        for(int i =0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and columns for matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int arr2[][]=new int[r2][c2]; //total elements = r*c

        System.out.println("Enter "+r2*c2+" elements");
        for(int i =0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication of Matrix 1 and Matrix 2 after Matrices Multiplication is :");
        multiply(arr, r1, c1, arr2, r2, c2);
        sc.close();
    }
}


