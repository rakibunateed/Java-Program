import java.util.Scanner;

public class rightPettarn{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        // for (int i = num; i >= 1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(j);
                
        //     }
        //     System.out.print("\n");
        // }

        // for (int i = num; i >= 1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i%2);
                
        //     }
        //     System.out.println();}

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
            
        
    }
}