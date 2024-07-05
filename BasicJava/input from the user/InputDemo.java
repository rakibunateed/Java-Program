import java.util.Scanner;
public class InputDemo{
    public static void main(String[] args) {
        //integer data type
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        number = input.nextInt();
        System.out.println("Number ="+number);

        //string data type
        String name;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = input1.nextLine();
        System.out.println("Name ="+name);

        //float data type
        float num1;
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter any float number:");
        num1 = input3.nextFloat();
        System.out.println("Float number ="+num1);

        //double data type
        double num2;
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter any double number:");
        num2 = input4.nextDouble();
        System.out.println("Double number ="+num2);


    }
}