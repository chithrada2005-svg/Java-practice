public class triangle {
    public static void main(String a[]){
        int rows=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if (i==j||j==0||i==rows-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");

                }
            }System.out.println();
        }
        System.out.println();
        for(int i=rows;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
