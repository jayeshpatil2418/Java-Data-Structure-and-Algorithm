/*Given a matrix 'a' of dimension n x m and 2 coordinates (l1, r1) and (l2, r2).
Return the sum of the rectangle from (l1,rl) to (l2, r2).Use Alternate approach 
of prefix sum over both columns and rows*/

import java.util.Scanner;

class Problem3{

    static void findPrefixSumMatrix(int matrix[][]){
        int r=matrix.length;
        int c=matrix[0].length;
        // Traverse horizontally to calculate prefix sum for each row.
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        //Traverse vertically to calculate prefix sum for each column
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }

    static int rectangleSum(int matrix[][],int l1,int l2,int r1,int r2){
        int ans=0;
        int sum=0,up=0,left=0,upleft=0;
        findPrefixSumMatrix(matrix);
        
        sum=matrix[l2][r2];
        if(r1>=1){
            left=matrix[l2][r1-1];
        }
        if(l1>=1){
            up=matrix[l1-1][r2];
        }
        if(l1>=1&&r1>=1){
            upleft=matrix[l1-1][r1-1];
        }
        ans=sum-up-left+upleft;
        
        
        return ans;
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
        sc.close();
    }
}