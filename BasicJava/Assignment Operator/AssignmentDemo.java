import java.util.Scanner;
public class AssignmentDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any two number:");

        int x = input.nextInt();
        int y = input.nextInt();

        x +=y;
        System.out.println("X ="+x);

        x -=y;
        System.out.println("X ="+x);

        x *=y;
        System.out.println("X ="+x);

        x /=y;
        System.out.println("X ="+x);

        x %=y;
        System.out.println("X ="+x);  
        
    }
}