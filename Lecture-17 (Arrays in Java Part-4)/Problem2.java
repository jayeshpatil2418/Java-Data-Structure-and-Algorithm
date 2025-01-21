class Problem2{
    //Swap Two Numbers without using temp variable.(Use sum and difference)
    static void swapNumbers(int a , int b){
        System.out.println("Original Values Before Swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Values After Swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    public static void main(String[] args){
        int a =3;
        int b =9;
        swapNumbers(a, b);
    }
}