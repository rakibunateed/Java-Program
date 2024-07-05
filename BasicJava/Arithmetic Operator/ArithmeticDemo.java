import java.util.Scanner;

public class ArithmeticDemo{
    public static void main(String[] args) {
        int num1,num2;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = input.nextInt();
        System.out.print("Enter second number:");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("Sum is:"+result);

        result = num1 - num2;
        System.out.println("SuB is:"+result);

        result = num1 * num2;
        System.out.println("MUl is:"+result);

        result = (double)num1 / num2;
        System.out.println("Div is:"+result);

        result = num1 % num2;
        System.out.println("Rem is:"+result);
        


    }
    
}