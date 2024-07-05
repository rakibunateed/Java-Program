import java.util.Scanner;
public class age {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int num = input.nextInt();

        if (num >= 18) {
            System.out.print("Valid voter");
        }
       else
       {
        System.out.print("Invalid voter");
       }
        
    }
}