import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any 5 numbers:");

        int [] number = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
            
        }
        System.out.print("EVen numbers:");
        for (int i = 0; i < 5; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(+number[i]+" ");   
            }
        }
        System.out.print("\nOdd numbers:");
        for (int i = 0; i < 5; i++) {
            if (number[i] % 2 != 0) {
                System.out.print(+number[i]+" ");   
            }
        }
        
    }
}