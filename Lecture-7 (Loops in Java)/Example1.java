import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        // Code for addding up series of integer from user input...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int sum=0;
        //Using While Loop
        // while(n!=-1){
        //     sum+=n;
        //     n=sc.nextInt();
        // }
        // System.out.println("The sum is : "+sum);
        
        //Using Do-While Loop
        do{
            sum+=n;
            n=sc.nextInt();
        }
        while(n!=-1);
        System.out.println("The sum is : "+sum);
        sc.close();
    }
    
}
