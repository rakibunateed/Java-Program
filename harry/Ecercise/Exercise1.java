import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("English:");
        float a = input.nextFloat();
        System.out.print("Math:");
        float b = input.nextFloat();
        System.out.print("Bangla:");
        float c = input.nextFloat();
        System.out.print("Science:");
        float d = input.nextFloat();
        System.out.print("Hindi:");
        float e = input.nextFloat();

       float sum = (a+b+c+d+e);
       float total = 100*5;


       total = (sum/total)*100;
       System.out.printf("%.0f",total);
        
    }
}