public class Parameters {
    int sum(int a , int b){ //here a and b are formal parameters...
        return a+b;
    }
    public static void main(String[] args) {
        Parameters obj = new Parameters();
        System.out.println(obj.sum(3,5)); /*here these 3,5 which are value of a and
        b are known as actual parameters...*/
    }
}
