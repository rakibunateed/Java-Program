import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit:");
        int num = input.nextInt();

        int temp = num;
        int r,sum=0;

        while (temp !=0) {
            r=temp%10;
            sum = sum *10 +r;
            temp = temp /10;
        }
        if (num == sum) {
            System.out.print("This is a Palindrome number.");
        }
        else
        {
            System.out.println("This is not a Palindrome number.");
        }


    }
}