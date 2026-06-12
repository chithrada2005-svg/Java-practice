import java.util.*;
public class Array_Methods {
    public static void main(String args[]){
        int[] ar={22,3,44,5,1,52};
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.print(Arrays.binarySearch(ar,44));
    }
}
