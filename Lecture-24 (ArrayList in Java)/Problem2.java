import java.util.ArrayList;
import java.util.Collections;

public class Problem2 {
    //Write a program to sort an ArrayList of Strings in descending order.
        
        public static void main(String[] args) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add("Jayesh");
            l1.add("Atharva");
            l1.add("Sumit");
            l1.add("Amit");
            l1.add("Om");
            System.out.println("Original List: "+l1);
            Collections.sort(l1);
            System.out.println("Ascending Sorted List: "+l1);
            Collections.sort(l1,Collections.reverseOrder());
            System.out.println("Descending Sorted List: "+l1);
    
    
        }
        
    }

