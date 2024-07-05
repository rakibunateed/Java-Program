import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 integer numbers:");

        int [] number = new int[5];

        for (int i = 0; i < 5; i++) {

            number[i]=input.nextInt();
        }

        // positive number
        System.out.print("Positive numbers:");
        for (int i = 0; i < 5; i++) {
            if (number[i] > 0) {
                System.out.print(number[i]+" ");
                
            }
        }
            // negative number
        System.out.print("\nNegative numbers:");
        for (int i = 0; i < 5; i++) {
            if (number[i] < 0) {
                System.out.print(number[i]+" ");
                
            }
        }
            // zero
            System.out.print("\nThis number is zero:");
        for (int i = 0; i < 5; i++) {
            if (number[i] == 0) {
                System.out.print(number[i]+" ");
                
            }
            
        }
    }
}
    