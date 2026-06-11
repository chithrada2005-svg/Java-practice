import java.util.*;
public class task {
    public static void main(String args[]){
        Student data=new Student();
        data.getDetails(200,"Student1","Random");
        data.display();

    }
}
class Student{
    private int studentId;
    private String studentName;
    private String course;
    public void getDetails(int studentId,String studentName,String course){
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }
    public void display(){
        System.out.println(studentId);
        System.out.println(studentName);
        System.out.println(course);

    }
}
