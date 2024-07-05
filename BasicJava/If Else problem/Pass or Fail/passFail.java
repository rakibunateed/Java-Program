import java.util.Scanner;

public class passFail {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your Marks:");
        int marks = input.nextInt();
      

        if (marks >= 80 && marks <= 100) {
            System.out.print("Your are Pass.\nA+");
        }

        else if (marks >= 75 && marks <=79) {
            System.out.println("Your are Pass.\nA");
            
        }
        else if (marks >= 70 && marks <=74) {
            System.out.println("Your are Pass.\nA-");
            
        }
        else if (marks >= 60 && marks <=69) {
            System.out.println("Your are Pass.\nB");
            
        }
        else if (marks >= 50 && marks <=59) {
            System.out.println("Your are Pass.\nB+");
            
        }
        else if (marks >= 40 && marks <=49) {
            System.out.println("Your are Pass.\nB-");
            
        }
        else if (marks >= 0 && marks < 40) {
            System.out.print("Your are fail");
            
        }
        else
        {
            System.out.println("invalid marks.");
        }

    }
}