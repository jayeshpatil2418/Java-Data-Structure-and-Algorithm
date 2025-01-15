public class ArrLength {
    void demoArrays(){
        //Syntax for Declaring an array...
        int arr[];
        // String names[]=new String[3];
        // float weights[]=new float[3];

        String names[] = {"Jayesh","Bhavesh","Rishi"};
        //Printing length of Array "Names"
        System.out.println("Length of array \"names\" is "+names.length);
        
        arr = new int[3];//Here 3 represent the size of an array...
        
        //Inserting Values inside the array... 
        arr[0]=10;
        arr[1]=20;
        arr[2]=54;
        // arr[5]=25; Out of bounds error...
        
        //Printing length of Array 1
        System.out.println("Length of array 1 is "+arr.length);
        //Accessing Values of array ...
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        //Another Syntax for Declaring and Intialisation of array...
        int arr1[]={1,2,3,4}; //-> This is known as array literal
        
        //Printing length of Array 2
        System.out.println("Length of array 2 is "+ arr1.length);
        //Accessing Values of array ...
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
    }

    public static void main(String[] args) {
        ArrLength obj = new ArrLength();
        obj.demoArrays();
        
    }
}
