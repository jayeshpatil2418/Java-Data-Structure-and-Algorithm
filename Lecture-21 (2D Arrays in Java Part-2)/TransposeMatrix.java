import java.util.Scanner;
class TransposeMatrix{


    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposeMatrix(int arr[][],int r , int c){
        int arr2[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        return arr2;
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
        int arr2[][]=transposeMatrix(arr, r, c);
        System.out.println("Transpose of given Matrix: ");
        printArray(arr2);
        sc.close();
    }
}