class Demo{
    int a; //Member Variables
    int b; //These are class level variables

    int add(){
        int p=20;
        int q=30; //These are method level variables
        return p+q;
    }

    int sub(){
        return a-b;
    }

    void demo(){
        int m =10;
        System.out.println(m);
        //System.out.println(n);
        for(int i=0;i<5;i++)
        { //this is a demo block...
            //int n=20;
            //System.out.println(n); //20
            System.out.println(i);
        }
        //System.out.println(i); "i" cannot be acessed here...

        for(int i=0;i<2;i++)
        {
            //this is a second demo block...
            //int n =200;
            //System.out.println(n); //200
            System.out.println(i);
        }
    }

}
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        // Same Variable name cannot be declared within the same scope...
        // int a = 11;
        // double a = 1.1;
        // String a = "java"
        Demo obj = new Demo();
        obj.demo();
    }

}
