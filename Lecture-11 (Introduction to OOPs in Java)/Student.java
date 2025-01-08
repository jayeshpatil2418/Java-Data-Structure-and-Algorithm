public class Student {
    int rollNo;
    String studentName;
    //There can only be one public class in java file...
    //Java file name must be name of public class...
    public static void main(String[] args) {
        Student obj = new Student();
        obj.rollNo=24;
        obj.studentName="Sahil";
        System.out.println(obj.rollNo);
        System.out.println(obj.studentName);
        
        Student obj1 = new Student();
        obj1.rollNo=19;
        obj1.studentName="Jayesh";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);
    }
}
