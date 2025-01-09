import java.util.Scanner;

class Algebra{
    public int sum(int a ,int b){
        return a+b;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int y = sc.nextInt();
        Algebra obj=new Algebra();
        System.out.println("The sum of entered number is : "+obj.sum(x,y));
        sc.close();

    }
}