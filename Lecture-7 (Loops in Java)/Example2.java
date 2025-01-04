// import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int i=sc.nextInt();
        int n=1;
        while(true){
            if((n%5==0) && (n%7==0)){
                System.out.println("Ans Found : "+ n);   
                break;      
            }
            n++;
        }
        //  sc.close();
    }    
}
