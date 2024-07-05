import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class practice1 {

    public static void main(String[] args) {
        
        //Question 1

        // int a = 45, b = 55, c = 36;
        // int sum = a+b+c;
        // System.out.println(sum);


        // Question 2

        // float subject1 = 96;
        // float subject2 = 48;
        // float subject3 = 69;

        // float cgpa = (subject1 + subject2 + subject3) /30;
        // System.out.println(cgpa);


        //Question 3
        // Scanner input = new Scanner(System.in);

        // String name = input.nextLine();

        // System.out.println("\""+name+"\"");

        //Question 4

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Kilometer:");
        double kil = input.nextDouble();

        double mils = (kil / 1.6);
        System.out.println(mils);
         
        
        




    }
}