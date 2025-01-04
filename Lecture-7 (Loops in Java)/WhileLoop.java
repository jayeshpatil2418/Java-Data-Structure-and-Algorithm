import java.util.Scanner;
public class WhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int i=1;
        // while(i<=num){
        //     System.out.println(i);
        //     i++;
        // }
        
        // Sum of N Natural Numbers
        int sum=0;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println("The sum is : "+sum);

        sc.close();
    }
}