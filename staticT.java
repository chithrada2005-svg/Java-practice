public class staticT {
    public static void main(String args[]){
        Student s1 = new Student(100, "ABC", 9.8);
        s1.show();
        s1.display();
        }
}

class Student {
    private int rollNo;
    private String name;
    private double marks;
    static String colg = "RCE";
    
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public void show() {
        System.out.println(this.rollNo + " " + this.name + " " + this.marks + " " + Student.colg);
    }
    static public void display(){
        System.out.println("From display");
    }
}