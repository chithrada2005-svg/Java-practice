import java.util.Scanner;
public class hello2 {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
        double percentage=input.nextDouble();
        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if(percentage<90 && percentage>=80){
            System.out.println("Grade B");
        }
    }
}
