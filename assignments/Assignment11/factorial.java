import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num =input.nextInt();
        int fact=1;

        for (int i = 1; i <=num; i++) {

            fact *=i;
            
        }
        System.out.println("Factorial of " +num+" is:"+fact);
    }
}