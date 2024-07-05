import java.util.Scanner;

public class infinite {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        

        String user;
        int pass;

        int ok=0;
        while (ok==0) {
            System.out.print("\nEnter the user name:");
            user = input.nextLine();

            System.out.print("Enter the password:");
            pass = input.nextInt();

            if (user.equals("anis")&&pass==123456) {
                System.out.print("Welcome to the System!!");
                break;
                
            }
            else
            {
                System.out.print("Wrong username/password. Try again");
            }
            input.nextLine();
        }
    }
}