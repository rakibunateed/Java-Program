import java.util.Scanner;

public class oddEven{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print("This is a even number");
        }
        else
        {
            System.out.print("This is a odd number");
        }
    }
}