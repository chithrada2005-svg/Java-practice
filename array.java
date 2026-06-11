import java.util.*;
public class array {
    public static void main(String arg[]){
        Scanner ip = new Scanner(System.in);
        int ch=ip.nextInt();
        int []arr=new int[ch];
        for(int i=0;i<ch;i++){
            arr[i]=ip.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    
}
