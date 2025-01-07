import java.util.Scanner;
public class DecToBin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int decimal_num = sc.nextInt();
        int binary_num =0;
        int pw=1;
        while(decimal_num>0){
            int parity_num = decimal_num%2;
            binary_num+=(parity_num*pw);
            decimal_num/=2;
            pw*=10;
        }
        System.out.println(binary_num);
        sc.close();

    }
}