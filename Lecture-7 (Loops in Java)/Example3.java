import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i=1;
        // Printing series of numbers not divisible by 3(Continue Statement)
        // By Using While Loop
        while(i<=n){
            if(i%3==0){
                i++;
                continue;
            }   
            System.out.println(i); 
            i++;
        
        // //By Using For Loop 
        // for(int i=1;i<=50;i++){
        //     if(i%3==0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }  
        sc.close();     
        }
    }       
}    

