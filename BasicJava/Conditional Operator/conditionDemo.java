import java.util.Scanner;

public class conditionDemo{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first numbers:");
    int num1= input.nextInt();
    System.out.print("Enter the second numbers:");
    int num2 = input.nextInt();

    int large = (num1 > num2) ? num1 : num2;

    System.out.print("The large number is:"+large);


    }
}