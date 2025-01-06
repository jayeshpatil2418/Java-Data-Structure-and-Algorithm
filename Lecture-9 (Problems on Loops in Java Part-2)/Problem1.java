import java.util.Scanner;
public class Problem1{
    //Rectangular Pattern Printing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c = sc.nextInt();
        for(int i=r;i>0;i--){
            for(int j=c;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}