public class MultiArray {
    void multiArray(){
        //This is a 2-D Array...
        int arr[][]=new int[3][3]; //This array will contain 3*3 = 9 elements...
        
        //Intialization of values in 2-D array...
        arr[0][0]=12;
        arr[0][1]=24;
        arr[0][2]=36;

        arr[1][0]=1;
        arr[1][1]=2;
        arr[1][2]=3;

        arr[2][0]=5;
        arr[2][1]=4;
        arr[2][2]=6;

        //Accesing Values of 2-D Array
        System.out.println("Values of First Array: ");
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        //This is another way of declaring 2-D array...
        int arr1[][]={{1,2,3},{4,5,6}}; //This is 2-D array of size 2*3 = 6 elements...

        //Accesing Values of 2-D Array
        System.out.println("Values of Second Array: ");
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[1][2]);

        //int arr2 [][][] = new int[3][3][3]; //This is a 3-D array with 3*3*3 elements...

        //Intialization of values in 3-D array...
        // arr2[0][0][0]=98;
        // arr2[0][0][1]=23;

        //Accesing Values of 3-D Array
        // System.out.println(arr2[0][0][0]);
        // System.out.println(arr2[0][0][1]);

    }
    public static void main(String[] args) {
        MultiArray obj = new MultiArray();
        obj.multiArray();
    }
}
