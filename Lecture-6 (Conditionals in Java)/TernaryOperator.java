import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        String result = (num%2==0)?"even":"odd";
        System.out.println(result);
        sc.close();
    }
}
