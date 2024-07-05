import java.util.Scanner;

public class maximumMinimum {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();
        System.out.print("Enter the third number:");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("First number is the maximum number.");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.print("Second number is the maximum number.");
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.print("Third number is the maximum number.");
        }
        else
        {
            System.out.println("All number are equal.");
        }
    



    }
}