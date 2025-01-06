import java.util.Scanner;
public class Problem3 {
    // Triangle Pattern Printing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        //int c =sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
