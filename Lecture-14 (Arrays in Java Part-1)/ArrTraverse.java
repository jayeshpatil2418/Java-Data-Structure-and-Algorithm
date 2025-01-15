public class ArrTraverse {
    void demoArray1(){
        int arr[] = {1,2,3,4,5,6};
        
        //Traversing through an array using for loop...
        System.out.println("Traversing through an array using for loop");
        for(int i =0 ; i<6;i++){
            System.out.println(arr[i]);
        }

        //Traversing through an array using for each loop...
        System.out.println("Traversing through an array using for each loop");
        for(int i:arr){
            System.out.println(i);
        }

        //Traversing through an array using while loop...
        System.out.println("Traversing through an array using while loop");
        int i =0;
        while(i<6){
            System.out.println(arr[i]);
            i++;
        }
    }

    void multiArray(){
        int multiarr[][]={{10,20,30},{40,50,60},{70,80,90}};

        //Traversing through an array using for loop...
        System.out.println("Traversing through an multi-dimensional array using for loop");
        for(int i=0;i<multiarr.length;i++){
            for(int j =0;j<multiarr[i].length;j++){
                System.out.print(multiarr[i][j]+" ");
                
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        ArrTraverse obj = new ArrTraverse();
        obj.demoArray1();
        obj.multiArray();
    }
}
