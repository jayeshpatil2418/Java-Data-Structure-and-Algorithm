import java.util.Scanner;
public class IfStatement{
    public static void main(String[] args) {
        //ODD-EVEN CODE
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number.");
        }
        else{
            System.out.println(num+" is a odd number.");
        }
        sc.close();

    }
}