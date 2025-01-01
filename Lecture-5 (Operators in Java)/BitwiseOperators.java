public class BitwiseOperators { //Performs Operation Bitwise
    public static void main(String[] args) {
        System.out.println("Bitwise AND : " + (9 & 10)); //Bitwise AND
        System.out.println("Bitwise OR : " + (9 | 10)); //Bitwise OR
        System.out.println("Bitwise XOR : "+(9 ^ 10)); //Bitwise XOR
        System.out.println("Bitwise NOT : "+(~ 9)); //Bitwise NOT
        System.out.println("Bitwise Left-Shift : "+(9<<1)); //Bitwise left shift operator (x<<i) "i" defines the places you want to shift...
        System.out.println("Bitwise Right-Shift : "+(9>>1)); //Bitwise right shift operator (x>>i) "i" defines the places you want to shift...
        //T calculate the value which will come after left shift of a<<b is a*2^b
        //To calculate the value which will come after right shift of a>>b is a/2^b
    }
}
