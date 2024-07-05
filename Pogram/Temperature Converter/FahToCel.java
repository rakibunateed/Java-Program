import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        float C,F;
        System.out.print("Enter the Temperature:");
        F = input.nextFloat();

        C =5/9.f*(F-32);
        System.out.print("C is:"+C);
    }
    
}
