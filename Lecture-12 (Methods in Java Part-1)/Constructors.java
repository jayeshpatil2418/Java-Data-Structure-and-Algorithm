class Con {
    int a; 
    int b;

    // Constructor name must be same as class name...
    // Constructor is called when an object of a class is created...

    // This is non parameterized constructor...
    // Con(){
    //     System.out.println("Constructor is called...");
    // }
    Con(int x,int y){
        System.out.println("Parameterized Constructor is called...");
        a=x;
        b=y;
    }
    int add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }
    
    int mul(){
        return a*b;
    }
}
public class Constructors{
    public static void main(String[] args) {
       Con obj = new Con(5,7);
       System.out.println(obj.add());
       System.out.println(obj.sub());
       System.out.println(obj.mul());
        
       Con obj1 = new Con(2,8);
       System.out.println(obj1.add());
       System.out.println(obj1.sub());
       System.out.println(obj1.mul());
    }
}
