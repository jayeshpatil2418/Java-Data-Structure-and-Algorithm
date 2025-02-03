import java.util.Scanner;

class GenerateSpiral{

    static void printMatrix(int matrix[][],int n ){
        System.out.println("Given Matrix is: ");
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int matrix[][]=new int[n][n];
        int topRow=0 , bottomRow=n-1,leftCol=0,rightCol=n-1;
        int curr=1;
        
        while(curr<=n*n){

            for(int j=leftCol;j<=rightCol&&curr<=n*n;j++){
                matrix[topRow][j]=curr++;
            }
            topRow++;

            for(int i=topRow;i<=bottomRow&&curr<=n*n;i++){
                matrix[i][rightCol]=curr++;
            }
            rightCol--;

            for(int j=rightCol;j>=leftCol&&curr<=n*n;j--){
                matrix[bottomRow][j]=curr++; 
            }
            bottomRow--;

            for(int i=bottomRow;i>=topRow&&curr<=n*n;i--){
               matrix[i][leftCol]=curr++;   
            }
            leftCol++;
        }
        return matrix;
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for n*n matrix: ");
        int n=sc.nextInt();
        System.out.println("Spiral Matrix: ");
        int matrix[][]=generateSpiralMatrix(n);
        printMatrix(matrix, n);
        sc.close();
    }
}