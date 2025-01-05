import java.util.Scanner;
public class Problem3 {
    //Code for Reversing a Number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int rev=0;
        //Using For-Loop
        for(int i=n;i>0;i/=10){
            rev=(rev*10+i%10);
        }

        //Using While Loop
        // while(n>0){
        //     rev=(rev*10+n%10);
        //     n/=10;
        // }
        System.out.println("Reverse Number: "+rev);
        sc.close();
    }
}
