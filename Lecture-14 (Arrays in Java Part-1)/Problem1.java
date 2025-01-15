public class Problem1 {
    //Calculate the sum of all the elements in the given array...
    void sumOfArray(){
        int arr[]={1,5,3};
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of all the elements in the given array is : "+ sum);
    }
    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        obj.sumOfArray();
    }
}
