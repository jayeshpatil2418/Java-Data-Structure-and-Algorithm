import java.util.Scanner;
public class Problem5 {
    //To Calculate series of Factorial of given number(i.e for 5 calculate factorial of 1,2,3,4,5) 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
        // for(int i=1;i<=n;i++){
        //     int fact=1;
        //     for(int j=i;j>0;j--){
        //         fact=fact*j;
        //     }     
        //     System.out.println("Factorial of "+i+" is "+fact);
        // }
        sc.close();
    }
}
