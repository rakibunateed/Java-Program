import java.util.Scanner;

public class positiveNegative {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = input.nextInt();

        if (num > 0) {
            System.out.print("This number is Positive.");
        }
        else if (num < 0) {
            System.out.print("This number is Negative.");
        }
        else
        {
            System.out.print("This number is Zero.");
        }



    }
}