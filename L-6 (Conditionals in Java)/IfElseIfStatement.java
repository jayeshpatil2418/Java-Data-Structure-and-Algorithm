import java.util.Scanner;
public class IfElseIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age=sc.nextInt();
        if(age<=12){
            System.out.println("Child");
        }
        else if(age>12 && age<18){
            System.out.println("Teen");
        }
        else{
            System.out.println("Adult");
        }
        sc.close();
    }
}
