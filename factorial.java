import java.util.*;
public class factorial {
    public static void main(String a[]){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i,n=ip.nextInt();
        long result=1;
        for(i=1;i<=n;i++){
            result*=i;
        }
        System.out.println("The Factorial of "+n+" is "+result);
    }
}
