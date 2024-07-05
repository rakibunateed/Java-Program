// Fahrenheit to Celsius

import java.util.Scanner;
public class CelToFah{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float C,F;
        System.out.print("Enter the Temperature:");
        C = input.nextFloat();

        F =9/5.0f*C+32;
        System.out.print("F is:"+F);

        
    }
}