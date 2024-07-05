import java.util.Scanner;

public class sumOfOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int sum =0;

        for (int i = num1; i <= num2 ; i+=2) {
            sum +=i; 
        }
        System.out.println("Sum of Odd numbers:"+sum+".");

    }
}