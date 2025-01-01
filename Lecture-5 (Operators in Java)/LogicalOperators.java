import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int p = sc.nextInt();
        System.out.println("Enter num2: ");
        int q = sc.nextInt();
        System.out.println((p==q) && (p>q)); // AND Operator
        System.out.println((p==q) || (p>q)); //OR Operator
        System.out.println(!(p==q)); //NOT Operator
        sc.close();
    }
    
}
