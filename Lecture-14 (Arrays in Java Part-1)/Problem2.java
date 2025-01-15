public class Problem2 {
    void maxOfArray(){
        //Calculate the maximum value out of all the elements in the array... 
        int arr[]={1,5,3,6};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value out of all the elements in the array is : "+ max);
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        obj.maxOfArray();
    }
}
