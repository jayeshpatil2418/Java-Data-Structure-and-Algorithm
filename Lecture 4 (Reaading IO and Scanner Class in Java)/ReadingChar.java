import java.util.Scanner;
public class ReadingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character or Word : ");
        char ch = sc.next().charAt(3);
        System.out.println("Character is : "+ ch);
        sc.close();
    }    
}
