public class class_objects{
    public static void main(String args[]){
        demo obj1=new demo();
        obj1.SetA(200);
        obj1.GetA();
    }
}
class demo{
    private int a;
    public void SetA(int a){
        this.a=a;
    }
    public void GetA(){
        System.out.println("A= "+a);
    }
}