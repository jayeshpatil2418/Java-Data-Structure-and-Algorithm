class Problem1{
    //Swap Two Numbers using temp variable. 
    static void swapNumbers(int a , int b){
        System.out.println("Original Values Before Swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        
        int temp=a;
        a=b;
        b=temp;

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