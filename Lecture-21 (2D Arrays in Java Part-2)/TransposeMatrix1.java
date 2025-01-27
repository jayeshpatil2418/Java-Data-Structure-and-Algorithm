import java.util.Scanner;
class TransposeMatrix1{
    //Transpose a given matrix into a same matrix.

    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void transposeMatrix(int arr[][],int r , int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        printArray(arr);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter "+r*c+" elements of 2d array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Transpose of given Matrix: ");
        transposeMatrix(arr, r, c);
        sc.close();
    }
}