import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age=sc.nextInt();
        if(age<=12){
            if(age<5){
                System.out.println("Toddler");
            }
            else{
                System.out.println("Child");
            }    
        }
        else{
            System.out.println("Teen or Adult");
        }
        sc.close();
    }
    
}
