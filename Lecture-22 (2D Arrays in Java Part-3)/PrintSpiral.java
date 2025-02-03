import java.util.Scanner;

class PrintSpiral{

    static void printMatrix(int mat[][],int r , int c){
        System.out.println("Given Matrix is: ");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralMatrix(int mat[][],int r, int c){
        int topRow=0 , bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements=0;
        
        while(totalElements<r*c){
            for(int j=leftCol;j<=rightCol&&totalElements<r*c;j++){
                System.out.print(mat[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            for(int i=topRow;i<=bottomRow&&totalElements<r*c;i++){
                System.out.print(mat[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            for(int j=rightCol;j>=leftCol&&totalElements<r*c;j--){
                System.out.print(mat[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            for(int i=bottomRow;i>=topRow&&totalElements<r*c;i--){
                System.out.print(mat[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter "+r*c+" elements for matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        printMatrix(mat, r, c);
        System.out.println("Elements after spiral traversal are: ");
        printSpiralMatrix(mat, r, c);
        sc.close();
    }
}