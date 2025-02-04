/*Given a matrix 'a' of dimension n x m and 2 coordinates (l1, r1) and (l2, r2).
Return the sum of the rectangle from (l1,rl) to (l2, r2).*/

import java.util.Scanner;

class Problem1{

    static int rectangleSum(int matrix[][],int l1,int l2,int r1,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
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
        sc.close();
    }
}