public class setter_getter {
    public static void main(String args[]){
        Set_Get emp1=new Set_Get();
        emp1.SetempId(112);
        emp1.SetempName("Employee1");
        System.out.println(emp1.GetempId()+":"+emp1.GetempName());
    }
}
class Set_Get{
    private int empId;
    private String empName;
    public void SetempId(int empId){
        this.empId=empId;
    }
    public void SetempName(String empName){
        this.empName=empName;
    }
    public int GetempId(){
        return empId;
    }
    public String GetempName(){
        return empName;
    }
}