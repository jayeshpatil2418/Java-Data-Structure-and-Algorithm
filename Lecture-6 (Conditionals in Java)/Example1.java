import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        String ans = (num %2==0 && num%3==0)?"Entered number is even and divisible by 3":"Entered number is neither even nor divisible by 3 or both.";
        System.out.println(ans);
        sc.close();
    }
    

    
}
