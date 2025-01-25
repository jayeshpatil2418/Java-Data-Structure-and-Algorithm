public class MultiDimensionalArray{
    
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //int arr[][] = new int[3][4];
        
        int arr2[][]={
            {1,5,6},
            {3,7,9},
            {8,1,4}
         };
        printArray(arr2);
    }
}