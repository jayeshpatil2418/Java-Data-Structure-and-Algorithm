import java.util.ArrayList;
public class ArrayOperations {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        //Syntax for creating ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        //Adding new element
        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(8);

        //Get element at index i

        System.out.println(l1.get(0));

        //Print with for Loop
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        //Print the arraylist directly
        System.out.println(l1);

        //Adding element at some index
        l1.add(1,100);
        System.out.println(l1);

        //modfying element at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(2));
        System.out.println(ans);
        boolean res = l1.contains(Integer.valueOf(6));
        System.out.println(res);

        //if you do not specify wrapper class for ArrayList,then you can put anything inside the wrapper class
        //Wrapper class(Integer,Float,Boolean etc...)
        //This statement hepled me to print the value without warning...
        @SuppressWarnings("rawtypes")
        ArrayList l = new ArrayList ();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);

    }
}
