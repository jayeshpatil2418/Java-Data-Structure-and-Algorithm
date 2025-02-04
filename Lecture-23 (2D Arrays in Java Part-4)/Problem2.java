/*Given a matrix 'a' of dimension n x m and 2 coordinates (l1, r1) and (l2, r2).
Return the sum of the rectangle from (l1,rl) to (l2, r2).Use Alternate approach 
of prefix sum */

import java.util.Scanner;

class Problem2{

    static void findPrefixSumMatrix(int matrix[][]){
        int r=matrix.length;
        int c=matrix[0].length;
        // Traverse horizontally to calculate prefix sum for each row.
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }

    static int rectangleSum(int matrix[][],int l1,int l2,int r1,int r2){
        int sum=0;
        findPrefixSumMatrix(matrix);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=matrix[i][r2]-matrix[i][r1-1];
            }
            else{
                sum+=matrix[i][r2];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for matrix: ");
        int r=sc.nextInt();
        System.out.println("Enter number of columns for matrix: ");
        int c=sc.nextInt();

        System.out.println("Enter "+r*c+" elements for the matrix: ");
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Rectangle Boundaries: ");
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Rectangle Sum: "+rectangleSum(matrix, l1, l2, r1, r2));
        System.out.println("Rectangle Sum: "+rectangleSum(matrix, l1, l2, r1, r2));
        sc.close();
    }
}