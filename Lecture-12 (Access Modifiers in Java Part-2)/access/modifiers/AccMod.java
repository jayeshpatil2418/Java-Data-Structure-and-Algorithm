package access.modifiers;

public class AccMod {
    //  
    public String str_1 = "I am a public member.";
    void printFromClass(){
        System.out.println("Within Class: "+str_1);
    }
    public static void main(String[] args) {
        AccMod obj = new AccMod();
        obj.printFromClass();
        System.out.println(obj.str_1);
        AccMod2 obj1 = new AccMod2();
        obj1.printFromOutsideClass(); 
    }
}

class AccMod2{
    void printFromOutsideClass(){
        AccMod obj = new AccMod();
        System.out.println("Within Package,Outside Class: "+obj.str_1);
    }
}
