import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) {
        //Counting Digits in a user input number...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
        int count=0;
        ///Using For-Loop 
        for(int i=n ;i>0;i/=10){
            
            count++;
        }

        //Using While-Loop
        // while(n!=0){
        //     n/=10;
        //     count++;
        // }
        System.out.println("Total digits in given number are : "+ count);
        sc.close();
    }
}