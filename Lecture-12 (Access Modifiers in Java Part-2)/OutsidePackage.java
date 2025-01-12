import access.modifiers.*;
public class OutsidePackage {
    
    public static void main(String[] args) {
        AccMod obj = new AccMod();
        System.out.println("Outside Package,non-child Class: "+obj.str_1);
        OP1 obj3 = new OP1();
        obj3.printFromChildClass();
    }
    
}

class OP1 extends AccMod{
    void printFromChildClass(){
        OP1 obj3 = new OP1();
        System.out.println("Child Class: "+obj3.str_1);
    }
}