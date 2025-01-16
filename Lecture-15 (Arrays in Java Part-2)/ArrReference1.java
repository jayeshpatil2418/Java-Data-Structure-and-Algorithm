public class ArrReference1 {
    public static void changeValues(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        
        System.out.println("Array Before Calling 'changeValues' function:");
        printArray(arr);
        changeValues(arr);
        System.out.println("Array After Calling 'changeValues' function:");
        printArray(arr);
    }
}
