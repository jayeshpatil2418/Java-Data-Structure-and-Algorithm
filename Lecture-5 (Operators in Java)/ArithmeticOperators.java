import java.util.Scanner;
public class ArithmeticOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Addition : " + (num1+num2));
        System.out.println("Subtraction : " + (num1-num2));
        System.out.println("Division : " + (num1/num2)); // Return only integer quotient...
        System.out.println("Multiplication : " + (num1*num2));
        System.out.println("Modulus : " + (num1%num2)); //Returns Remainder
        sc.close();
    }
}