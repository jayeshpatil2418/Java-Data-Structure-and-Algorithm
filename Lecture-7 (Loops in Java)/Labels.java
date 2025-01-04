public class Labels {
    public static void main(String[] args) {
        outer : for(int i=0;i<50;i++){
            inner : for(int j=0;j<25;j++){
                break outer;//Labels are given to tell while loop has to break...
                
            }
        }
    }
}
