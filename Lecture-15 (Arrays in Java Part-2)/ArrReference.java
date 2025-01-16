public class ArrReference {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        System.out.println("Original arr: ");
        printArray(arr);

        int arr_2[] = arr;
        System.out.println("Copied arr_2: ");
        printArray(arr_2);

        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("Original arr after changing values in arr_2: ");
        printArray(arr);
        System.out.println("Copied arr_2 after changing values in arr_2: ");
        printArray(arr_2);

    }
}
