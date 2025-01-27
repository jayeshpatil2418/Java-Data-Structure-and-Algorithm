import java.util.Scanner;
class RotateArray{
    //Rotate an matrix by 90 degree in clockwise direction....

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
    }
    
    static void reverseArray(int [] arr){
        int i =0 , j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateArray(int arr[][],int n){
        transposeMatrix(arr, n, n);
        for(int i=0;i<n;i++){
            reverseArray(arr[i]);
        }     
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
        
        System.out.println("Matrix After Rotation: ");
        rotateArray(arr, c);
        printArray(arr);
        sc.close();
    }
}