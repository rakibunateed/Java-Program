import java.util.Scanner;

public class Assignment10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (1-10):");
        int num = input.nextInt();
        int sum =0;


        for (int i = 1; i <= num; i++) {
            sum+=i;
            System.out.println(i);            
        }
        System.out.print("Sum of all numbers:"+sum);

    }
} 