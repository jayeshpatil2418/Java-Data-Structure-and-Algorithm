import java.util.Scanner;
public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int p = sc.nextInt();
        System.out.println("Enter num2: ");
        int q = sc.nextInt();
        int r;
        r =p+q;
        System.out.println(r);
        System.out.println(p+=q); //25
        System.out.println(p-=q); //10
        System.out.println(p*=q); //150
        System.out.println(p/=q); //10
        sc.close();
    }
}
