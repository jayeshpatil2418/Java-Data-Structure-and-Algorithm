import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        String ans = (num%3==0 || num%5==0)?"Found":"Not Found";
        System.out.println(ans);
        sc.close();

    }
}
