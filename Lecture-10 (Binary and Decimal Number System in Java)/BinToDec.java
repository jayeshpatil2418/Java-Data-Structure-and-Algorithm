import java.util.Scanner;
public class BinToDec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int binary_num = sc.nextInt();
        int decimal_num=0;
        int pw =1;
        while(binary_num>0){
            int unit_digit = binary_num%10;
            decimal_num+=(unit_digit*pw);
            binary_num/=10;
            pw*=2;
        }
        System.out.println(decimal_num);
        sc.close();

    }
}