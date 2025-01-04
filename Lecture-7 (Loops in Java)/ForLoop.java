import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        //Printing 1 to n using For-Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        //Printing sum of n natural number using For-Loop
        int sum =0;
        for(int j=0;j<=n;j++){
            sum+=j;
        }
        System.out.println("The sum of first " +n+ " natural number is : "+ sum);
        sc.close();
    }
}
