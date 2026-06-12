import java.util.*;
public class constructor{
    public static void main(String s[]){
        Student student=new Student();
        student.setValues();
        student.display();
    }
}
class Student{
    private int id;
    private String name;
    private String course;

    public  void setValues(){
        Scanner ip =new Scanner(System.in);
        System.out.print("ENTER ID VALUE : ");
        this.id=ip.nextInt();
        System.out.print("ENTER YOUR NAME : ");
        this.name=ip.next();
        System.out.print("ENTER YOUR BRANCH : ");
        this.course=ip.next();
    }
    public void display(){
        System.out.println("ID : "+this.id);
        System.out.println("NAME : "+this.name);
        System.out.println("COURSE : "+this.course);
    }
}