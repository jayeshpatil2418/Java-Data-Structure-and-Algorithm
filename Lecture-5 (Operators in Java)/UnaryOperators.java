public class UnaryOperators  { // Unary Operator only requires one operand to operate upon...
    public static void main(String[] args) {
        int x=5;
        System.out.println(x++);
        System.out.println(++x);
        int p = ++x; //pre-increment(first increment then assign)
        System.out.println(p);
        int q = x++; //post-increment(first assign then increment)
        System.out.println(q);
    }
}
