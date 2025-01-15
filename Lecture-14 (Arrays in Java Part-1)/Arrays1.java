class Arrays1{

    void demoArrays(){
        //Syntax for Declaring an array...
        int arr[];
        String names[]=new String[3];
        float weights[]=new float[3];
        
        arr = new int[3];//Here 3 represent the size of an array...

        //Another Syntax for Declaring and Intialisation of array...
        int arr1[]={1,2,3,4}; //-> This is known as array literal

        //Inserting Values inside the array... 
        arr[0]=10;
        arr[1]=20;
        arr[2]=54;
        // arr[5]=25; Out of bounds error...

        //Accessing Values of array ...
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
    }
    public static void main(String[] args) {
        // //Syntax for Declaring an array...
        // int arr[];
        // arr = new int[3];//Here 3 represent the size of an array...
        // //Another Syntax for Declaring and Intialisation of array...
        // int arr1[]={1,2,3,4};

        // //Inserting Values inside the array... 
        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=54;

        // //Accessing Values of array ...
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);
        // System.out.println(arr1[3]);
        Arrays1 obj = new Arrays1();
        obj.demoArrays();

    }
}