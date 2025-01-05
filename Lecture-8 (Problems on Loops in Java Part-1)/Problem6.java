import java.util.Scanner;
// Given two numbers a and b. Find a raise to power b...
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b= sc.nextInt();
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("The value of "+a+" raise to "+b+" is : "+result);
        sc.close();
    }
    
}
