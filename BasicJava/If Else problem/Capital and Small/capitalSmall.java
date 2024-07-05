import java.util.Scanner;

public class capitalSmall {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any Latter:");
        char ch = input.next().charAt(0);

        if (ch >='a' && ch <= 'z') {
            System.out.print("This latter is Small.");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.print("This latter is Capital.");
        }
        else
        {
            System.out.print("This is special character or digit.");
        }



    }
}