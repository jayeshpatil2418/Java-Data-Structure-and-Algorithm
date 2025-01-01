import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1: ");
        int p = sc.nextInt();
        System.out.println("Enter num2: ");
        int q = sc.nextInt();
        System.out.println(p==q);
        System.out.println(p!=q);
        System.out.println(p>q);
        System.out.println(p<q);
        System.out.println(p<=q);
        System.out.println(p>=q);
        // All the Output will be boolean i.e true or false...
        sc.close();

    }
}
