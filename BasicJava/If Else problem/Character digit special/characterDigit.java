import java.util.Scanner;

public class characterDigit {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your character:");
        char ch = input.next().charAt(0);
        

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.print("This is a Character."); 
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.print("This is a Digit."); 
        }
        else
        {
            System.out.print("This is a Special Character.");
        }
        //hello i am ronaldo suiiii.


    }
}