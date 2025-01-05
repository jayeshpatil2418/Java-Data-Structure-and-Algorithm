import java.util.Scanner;
public class Problem2 {
    // To Calculate the Sum of Digits of the user input number...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=n;i>0;i/=10){
            sum+=i%10;
            
        }
        //Using For-Loop
        //Using While-Loop
        // while(n!=0){
        //     sum+=n%10;
        //     n/=10;
        // }
        System.out.println("The sum of digits for the given number is : "+ sum);
        sc.close();

    }
}
