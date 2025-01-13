public class PassingValues {
    /*There are two types of value passing into a method
    1. Pass by Value(Duplicate copy of original variable is created,
    Changes made inside method are not reflected outside it i.e it doesn't 
    change the value of original variable).

    2. Pass by reference(Duplicate copy of original variable is not created,Changes made to the original 
    variable inside the method are also reflected outside the method).
    
    3. In Java we only have pass by value...*/
    static void changeValue(int a){
        a*=100;
        System.out.println("Inside Method Change in Value: "+ a);
    }
    public static void main(String[] args) {
        int a=10;
        
        System.out.println("Before Change in Value: "+a);
        changeValue(a);
        System.out.println("After Change in Value: "+a);
        

    }
}
