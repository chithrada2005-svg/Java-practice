import java.util.*;
public class factors {
    public static void main(String a[]){
        Scanner ip=new Scanner(System.in);
        int i,n=ip.nextInt();
        System.out.print("The factors of "+n+" is");
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);
            }
        }
    }
}
