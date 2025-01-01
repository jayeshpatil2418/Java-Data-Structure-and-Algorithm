import java.util.Scanner;
class TakingInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Name: ");
        // String name = sc.next(); // Will not consider word after whitespace i.e input : Jayesh Patil output : Jayesh
        // System.out.println("Entered Name is :"+ name);
        
        System.out.println("Enter your name again: ");
        String fname = sc.nextLine();
        System.out.println("Entered name is: "+ fname);

        System.out.println("Enter the lucky number: ");
        int num = sc.nextInt();
        System.out.println("Entered Lucky Number is: "+ num);
        sc.close();
    }
}