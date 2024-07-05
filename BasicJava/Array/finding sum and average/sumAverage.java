import java.util.Scanner;

public class sumAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[5];
        int sum = 0;
        double average;

        System.out.print("Enter 5 numbers:");
        
        

        for (int i = 0; i <5; i++) {
            number [i] = input.nextInt(); 
            sum+=number[i];
        }
       
        System.out.println("Sum of all numbers:"+sum);

        average = sum/(double)5;
        System.out.print("Average of all numbers:"+average);
    }

}